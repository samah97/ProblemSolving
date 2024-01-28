package org.problem_solving.print_linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testPrintLinkedList() {
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertData(3);
        llist.insertData(8);
        llist.insertData(5);

        Solution.printLinkedList(llist.head);
    }

    @Test
    void testInsertNodeAtHead() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(3);
        Solution.insertNodeAtHead(head, 8);
        Solution.insertNodeAtHead(head, 5);
        Solution.printLinkedList(head);
    }

    @Test
    void testInsertNodeAtHead_nullHead() {
        SinglyLinkedListNode head = null;
        Solution.insertNodeAtHead(head, 8);
        Solution.insertNodeAtHead(head, 5);
        Solution.insertNodeAtHead(head, 20);
        Solution.printLinkedList(head);
    }


}