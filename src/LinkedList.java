public class LinkedList {

    Node head;
    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            prepend(data);
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }
    public void dequeue() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void pop() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteAt(int index) {
        if (index == 0) {
            dequeue();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        current.next = current.next.next;
    }

    public void FrontBackSplit(LinkedList list1, LinkedList list2) {
        Node current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        current = head;
        for (int i = 0; i < length / 2; i++) {
            list1.append(current.data);
            current = current.next;
        }
        while (current != null) {
            list2.append(current.data);
            current = current.next;
        }
    }

    public void SortedMerge(LinkedList list1, LinkedList list2) {
        Node current1 = list1.head;
        Node current2 = list2.head;
        LinkedList mergedList = new LinkedList();

        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                mergedList.append(current1.data);
                current1 = current1.next;
            } else {
                mergedList.append(current2.data);
                current2 = current2.next;
            }
        }
        while (current1 != null) {
            mergedList.append(current1.data);
            current1 = current1.next;
        }
        while (current2 != null) {
            mergedList.append(current2.data);
            current2 = current2.next;
        }
        head = mergedList.head;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("\n");
    }
}
