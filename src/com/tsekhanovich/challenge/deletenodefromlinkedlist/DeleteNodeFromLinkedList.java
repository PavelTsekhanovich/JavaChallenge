package com.tsekhanovich.challenge.deletenodefromlinkedlist;

/**
 * @author Pavel Tsekhanovich 31.07.2018
 * <p>
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * <p>
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 */

public class DeleteNodeFromLinkedList {

    private void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}