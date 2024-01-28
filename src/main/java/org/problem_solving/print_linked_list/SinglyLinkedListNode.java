package org.problem_solving.print_linked_list;


public class SinglyLinkedListNode {

    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data){
        this.data = data;
        this.next = null;
    }

    public SinglyLinkedListNode(int data, SinglyLinkedListNode next){
        this.data = data;
        this.next = next;
    }


}
