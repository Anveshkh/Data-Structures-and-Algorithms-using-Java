package Trial;

public class P1 {
    int rollno;
    String name;
    float marks;

    public P1(int r, String name, float marks){
        this.rollno = r;
        this.name = name;
        this.marks = marks;
    }

    public P1(){
        this.name = "Astha Bai";
        this.rollno = 10;
        this.marks = 78.8f;
    }

    void display(){
        System.out.println("Roll no:- " + rollno);
        System.out.println("Name:- " + name);
        System.out.println("Marks:- " + marks);
    }
}
