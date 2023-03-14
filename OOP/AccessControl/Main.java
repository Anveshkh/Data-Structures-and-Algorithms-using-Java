package OOP.AccessControl;

public class Main {
    public static void main(String[] args) {
        A obj = new A(28, "Anvesh");
        System.out.println(obj.name);
        System.out.println(obj.arr);
        System.out.println(obj.getNum());
        obj.setNum(29);
        System.out.println(obj.getNum());

    }
}
