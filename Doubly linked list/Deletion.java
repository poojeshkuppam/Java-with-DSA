class Deletion {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static Node deleteFromBeginning(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return head;
    }

    static Node deleteFromEnd(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;

        return head;
    }

    static Node deleteValue(Node head, int key) {
        if (head == null) {
            return null;
        }

        Node temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println(key + " not found");
            return head;
        }

        if (temp == head) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            return head;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        return head;
    }

    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);

        Node second = new Node(20);
        head.next = second;
        second.prev = head;

        Node third = new Node(30);
        second.next = third;
        third.prev = second;

        Node fourth = new Node(40);
        third.next = fourth;
        fourth.prev = third;

        Node fifth = new Node(50);
        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.print("Original List: ");
        printList(head);

        head = deleteFromBeginning(head);
        System.out.print("After delete from beginning: ");
        printList(head);

        head = deleteFromEnd(head);
        System.out.print("After delete from end: ");
        printList(head);

        head = deleteValue(head, 30);
        System.out.print("After delete value 30: ");
        printList(head);
    }
}