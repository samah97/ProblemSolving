package org.problem_solving.insert_node_llist;

import org.problem_solving.print_linked_list.SinglyLinkedListNode;

public class Solution {

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        if (llist == null){
            return null;
        }
        if(position == 1){
            SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(data);
            singlyLinkedListNode.next = llist;
            return singlyLinkedListNode;
        }

        SinglyLinkedListNode current = llist;
        while (current != null && position>=1){
            if (position == 1){
                SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(data);
                singlyLinkedListNode.next = current.next;
                current.next = singlyLinkedListNode;
            }
            current = current.next;
            position--;
        }
        return llist;
    }

}
