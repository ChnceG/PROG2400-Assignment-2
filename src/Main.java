public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();

        linkedList.prepend(3);
        linkedList.prepend(2);
        linkedList.prepend(1);
        linkedList.prepend(0);

        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);

        linkedList.printList();

        linkedList.insertAt(4, 4);

        linkedList.printList();

        linkedList.dequeue();
        linkedList.pop();

        linkedList.printList();

        linkedList.deleteAt(3);
        linkedList.printList();

        linkedList.FrontBackSplit(linkedList2, linkedList3);
        linkedList2.printList();
        linkedList3.printList();

        linkedList4.SortedMerge(linkedList, linkedList2);
        linkedList4.printList();
    }
}