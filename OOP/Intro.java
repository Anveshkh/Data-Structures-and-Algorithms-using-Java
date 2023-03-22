package OOP;

public class Intro {
    public static void main(String[] args) {
       final int a = 10;
        System.out.println(a);

    }

    static class Student{
        int rollno;
        String name;
        float marks;

        Student(Student other){
            this.rollno = other.rollno;
            this.name = other.name;
            this.marks = other.marks;
        }

        Student(){
            this.rollno = 28;
            this.name = "Anvesh Khambadkar";
            this.marks = 56.65f;
        }

        Student(int rollno, String name, float marks){
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }

        void getdata(){
            System.out.println(this.rollno);
            System.out.println(this.name);
            System.out.println(this.marks);
        }
    }
}
