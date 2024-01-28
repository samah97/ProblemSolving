package org.problem_solving.has_cycle_linkedlist;

import org.problem_solving.print_linked_list.SinglyLinkedListNode;
import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {

/*    public static boolean hasCycle(SinglyLinkedListNode head) {
        Set<SinglyLinkedListNode> nodeSet = new HashSet<>();
        if(head ==null){
            return false;
        }
        nodeSet.add(head);
        while (head.next!= null){
            head = head.next;
            if(nodeSet.contains(head)){
                System.out.println("Cycle for node "+head.data);
                return true;
            }
            nodeSet.add(head);
        }
        return false;
    }*/

    public static boolean hasCycle(SinglyLinkedListNode head){
        if(head.next == null) return false;

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast =  head.next;

        while(slow != fast){
            if(fast.next ==null || fast.next.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }


    public static boolean hasCycle2(SinglyLinkedListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        Stack<String> strings = new Stack<>();

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by one step
            fast = fast.next.next;    // Move fast pointer by two steps

            if (slow == fast) {
                return true; // Cycle detected if slow and fast pointers meet
            }
        }

        return false; // No cycle found
    }

}
