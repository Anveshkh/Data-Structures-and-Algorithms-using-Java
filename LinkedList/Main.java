package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insertFirst(1);
        list.insert(28, 3);
        list.insert(100, 4);
        list.display();
        list.deleteLast();

        list.display();
        System.out.println(list.delete(3));
        list.display();
    }
}
