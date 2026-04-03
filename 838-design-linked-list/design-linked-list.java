class MyLinkedList {
    private Node head;
    private int size;

    private static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node temp = head;
        for (int j = 0; j < index; j++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node n1 = new Node(val);
        n1.next = head;
        head = n1;
        size++;
    }

    public void addAtTail(int val) {
        Node n1 = new Node(val);
        if (head == null) {
            head = n1;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node n1 = new Node(val);
        Node temp = head;
        for (int j = 0; j < index - 1; j++) {
            temp = temp.next;
        }
        n1.next = temp.next;
        temp.next = n1;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int j = 0; j < index - 1; j++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }
}
