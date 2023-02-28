package OOP.staticExample;

public class InnerClasses {

    static class Test{
        // This class is not dependent on the objects of the InnerClasses
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Anvesh");
        Test b = new Test("Kunal");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
