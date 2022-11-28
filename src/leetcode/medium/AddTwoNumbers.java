package leetcode.medium;

import java.util.ArrayList;

public class AddTwoNumbers {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return build(getNumber(l1) + getNumber(l2));
    }

    static int getNumber(ListNode node) {
        int number = 0;
        int multiplier = 1;
        while (node != null) {
            number += multiplier * node.val;
            node = node.next;
            multiplier *= 10;
        }
        return number;
    }

    static ListNode build(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        int divisor = 10;
        int remainder;

        while (number > 0) {
            remainder = number % divisor;
            number = (number - remainder) / divisor;
            list.add(remainder);
        }

        ListNode[] nodes = new ListNode[list.size()];

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new ListNode(list.get(i));
        }

        for (int i = 0; i < nodes.length; i++) {
            if (i < nodes.length - 1) {
                nodes[i].next = nodes[i + 1];
            }
        }
        return nodes[0];
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        node.next = new ListNode(4);
        node.next.next = new ListNode(3);

        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(node, node2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

