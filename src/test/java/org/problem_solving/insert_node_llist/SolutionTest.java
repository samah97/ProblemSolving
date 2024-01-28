package org.problem_solving.insert_node_llist;

import org.junit.jupiter.api.Test;
import org.problem_solving.print_linked_list.SinglyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void insertNodeAtPosition() {
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertData(3);
        llist.insertData(8);
        llist.insertData(5);

        Solution.insertNodeAtPosition(llist.head, 4,2);
    }
}