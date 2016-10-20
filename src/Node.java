/**
 * Created by ytw on 9/21/16.
 */

import java.util.*;

public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;

    }

    Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next;
        }
        while (n.next != null) {
            n.next = n.next.next;
            return head;
        }
        return head;
    }

    Node appendNodeWithIntArray(Node head, int[] dataArray) {
        Node pointer = head;
        if (pointer == null & dataArray.length > 0) {
            pointer = new Node(dataArray[0]);
        }
        for (int i = 0; i < dataArray.length; i++) {
            pointer.next = new Node(dataArray[i]);
            pointer = pointer.next;
        }
        return head;
    }

    Node(int[] dataArray) {
        Node pointer = this;
        data = dataArray[0];
        for (int i = 0; i < dataArray.length; i++) {
            pointer.next = new Node(dataArray[i]);
            pointer = pointer.next;
        }
    }

    String listToString() {
        Node pointer = this;
        String returnString = "";
        while (pointer != null & pointer.next != null) {
            returnString += pointer.data + " ";
            pointer = pointer.next;
        }
        return returnString;
    }

    static void removeDup(Node n) {
        Set<Integer> dataSet = new HashSet<>();
        Node previous = null;
        Node current = n;
        while (current != null) {
            if (dataSet.contains(current.data)) {
                previous.next = current.next;
            } else {
                dataSet.add(current.data);
                previous = current;
            }

            current = current.next;
        }
    }
    static void removeDupNoBuffer(Node n){
        Node curr = n;
        while (curr != null){
            Node runner = curr;
            while (runner.next != null){
                if (runner.next.data == curr.data){
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            curr = curr.next;
        }
    }

    static int printKthToLast(Node n, int k) {
        if (n == null) {
            return 0;
        }
        int index = printKthToLast(n.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last Node is " + n.data);
        }
        return index;
    }

    void deleteMiddleNode(Node n) {
        Node next = n.next;
        n.next = n.next.next;
        n.data = n.next.data;
    }
    Node detectLoopStart(Node n){
        Node slow = n;
        Node fast = n;

        while (fast != null && fast.next != null){
            if (slow == fast){
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = n;

        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }


    public static void main(String[] args) {
//        int[] dataArray = {4, 9, 9, 2, 8, 4, 4, 5, 7, 2, 2, 6, 1, 0, 0, 4, 3, 2, 2, 3, 2, 4, 1};
//        Node n = new Node(dataArray);
//        System.out.println(n.listToString());
        //removeDup(n);
        //System.out.println(n.listToString());
        //printKthToLast(n,7);
        Node a = new Node(4);
        Node b = new Node(4);
        Node c = new Node(4);
        Node d = new Node(4);
        Node e = new Node(4);
        Node f = new Node(4);
        Node g = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = c;
        System.out.println(a.listToString());


    }
}
