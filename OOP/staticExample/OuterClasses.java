package OOP.staticExample;

class Test{
    // This class is not dependent on any other class i.e it is not dependent on any object
    static String name;
    public Test(String name){
        Test.name = name;
    }
}

public class OuterClasses {
    public static void main(String[] args) {
        Test a = new Test("Anvesh");
        Test b = new Test("Kunal");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
