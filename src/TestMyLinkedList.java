public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkList = new MyLinkedList(10);
        linkList.addFirst(1);
        linkList.addFirst(2);
        linkList.addFirst(3);

        linkList.add(2,9);
        linkList.add(6,9);

        linkList.printList();
    }
}
