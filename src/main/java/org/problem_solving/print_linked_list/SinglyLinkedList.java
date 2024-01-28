package org.problem_solving.print_linked_list;

public class SinglyLinkedList {

    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public void insertData(int data){
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }


}
