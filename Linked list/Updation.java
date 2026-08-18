class Updation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void update(Node head, int oldValue, int newValue) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                System.out.println("Updated " + oldValue + " to " + newValue);
                return;
            }
            temp = temp.next;
        }

        System.out.println(oldValue + " not found in the list");
    }

    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.print("Original List: ");
        printList(head);

        update(head, 30, 35);

        System.out.print("After Updation: ");
        printList(head);

        update(head, 100, 99);
    }
}