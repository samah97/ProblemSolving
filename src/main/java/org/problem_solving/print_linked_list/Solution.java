package org.problem_solving.print_linked_list;

public class Solution {

    public static void printLinkedList(SinglyLinkedListNode head) {
        if(head != null) {
            System.out.println(head.data);
            if(head.next != null){
                head = head.next;
                printLinkedList(head);
            }
        }
    }

    public static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if(llist==null){
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            llist = newNode;
        }else{
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(llist.data);
            newNode.next = llist.next;
            llist.next = newNode;
            llist.data = data;
        }
        return llist;
    }


}
