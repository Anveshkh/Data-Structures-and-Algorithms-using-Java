package LinkedList.DoublyLL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(28);
        list.insertFirst(12);
        list.insertFirst(27);
        list.insertFirst(90);

        list.display();
        list.insertFirst(1);
        list.display();
        list.insertLast(9);
        list.display();
        list.insert(3, 81);
        list.display();
        list.insertFirst(24);
        list.display();
    }
}
