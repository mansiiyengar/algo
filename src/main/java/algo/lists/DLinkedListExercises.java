package algo.lists;

/**
 * Some exercises with doubly-linked list
 * @author ahalikov
 */
class DLinkedListExercises {

    // Double linked list
    static class Node {
        int data;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    /**
     * Insert a node into a sorted doubly linked list
     */
    static Node sortedInsert(Node head, int data) {
        if (head == null) {
            // creating new list
            head = new Node();
            head.data = data;
        }
        else {
            Node curr = head;
            while (curr != null) {
                if (curr.data < data && curr.next != null && data <= curr.next.data) {
                    // Inserting after current node
                    Node p = new Node();
                    p.data = data;
                    p.prev = curr;
                    p.next = curr.next;

                    // Swapping links in prev in next nodes
                    curr.next.prev = p;
                    curr.next = p;
                    return head;
                } else if (curr.data < data && curr.next == null) {
                    // Adding node into the tail
                    Node p = new Node();
                    p.data = data;
                    p.prev = curr;
                    curr.next = p;
                    return head;
                } else if (curr.data >= data) {
                    // Inserting node to the head
                    Node p = new Node();
                    p.data = data;
                    p.next = curr;
                    curr.prev = p;
                    return p;
                }
                curr = curr.next;
            }
        }
        return head;
    }

    /**
     * Reverse a doubly-linked list
     *
     * In:  NULL <-- 2 <--> 4 <--> 6 --> NULL
     * Out: NULL <-- 6 <--> 4 <--> 2 --> NULL
     */
    static Node reverse(Node head) {
        if (head == null) return null;
        if (head.next == null) return head;
        Node curr = head, res = head;
        while (curr != null) {
            Node savedPrev = curr.prev,
                    savedNext = curr.next;
            curr.prev = curr.next;
            curr.next = savedPrev;

            if (savedNext == null) res = curr;
            curr = savedNext;
        }
        return res;
    }
}
