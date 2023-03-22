package OOP.staticExample;

public class Human {

     /*Static methods or variables can only be initialized once and
     * then they can be only modified*/
    int age;
    String name;
    int salary;
    boolean ismarried;
    static long population;

    static void message(){
        // This method is initialized in a class and does not need object
        // This method is common for all the objects
        System.out.println("Hello World");
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.ismarried = married;

        Human.population += 1;
    }

    public static void main(String[] args) {
        message();
    }
}


