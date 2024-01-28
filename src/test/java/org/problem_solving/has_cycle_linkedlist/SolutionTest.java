package org.problem_solving.has_cycle_linkedlist;

import org.apache.commons.math3.analysis.function.Sin;
import org.junit.jupiter.api.Test;
import org.problem_solving.print_linked_list.SinglyLinkedListNode;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {


    @Test
    void hasCycleSingleNode() {
        SinglyLinkedListNode head = createHead2();
        boolean hasCycle = Solution.hasCycle(head);
        assertTrue(hasCycle);
    }

    @Test
    void hasCycleMultipleNodes() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(5);
        SinglyLinkedListNode someNode = new SinglyLinkedListNode(3);
        SinglyLinkedListNode someNode2 = new SinglyLinkedListNode(10);
        SinglyLinkedListNode someNode3 = new SinglyLinkedListNode(9);
        head.next = someNode;
        someNode.next = someNode2;
        someNode2.next = someNode3;
        someNode3.next = someNode;
//        head.next = new SinglyLinkedListNode(8,
//                new SinglyLinkedListNode(3,
//                        new SinglyLinkedListNode(10)));
        boolean hasCycle = Solution.hasCycle(head);
        assertTrue(hasCycle);
    }

    SinglyLinkedListNode createHeadMultipleNodes(){
        SinglyLinkedListNode head = new SinglyLinkedListNode(5);
        head.next = new SinglyLinkedListNode(8,
                new SinglyLinkedListNode(3,
                        new SinglyLinkedListNode(10)));
        return head;
    }
    SinglyLinkedListNode createHead2(){
        SinglyLinkedListNode head = new SinglyLinkedListNode(5);
        head.next = head;
        return head;
    }

}