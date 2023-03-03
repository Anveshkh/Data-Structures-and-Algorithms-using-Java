package Trial;

public class Main {

    static class StudentData{
        int rollno;
        String name;
        float marks;

        static int population;

        public StudentData(){
            this.rollno = 28;
            this.name = "Anvesh";
            this.marks = 99.9f;
            StudentData.population += 1;
        }

        public StudentData(int rollno, String name, float marks){
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
            StudentData.population += 1;
        }

        public StudentData(StudentData other){
            this.rollno = other.rollno;
            this.name = other.name;
            this.marks = other.marks;
            StudentData.population += 1;
        }
    }

    public static void main(String[] args) {
        StudentData d1 = new StudentData();
        StudentData d3 = new StudentData(d1);
        StudentData d2 = new StudentData(8, "Astha Khambadkar", 96.9f);
        System.out.println("Printing values of d1 object:- ");
        System.out.println("Rollno = " + d1.rollno);
        System.out.println("Name = " + d1.name);
        System.out.println("Marks = " + d1.marks);

        System.out.println();

        System.out.println("Printing values of d2 object:- ");
        System.out.println("Rollno = " + d2.rollno);
        System.out.println("Name = " + d2.name);
        System.out.println("Marks = " + d2.marks);
        System.out.println();

        System.out.println("Printing values of d3 object:- ");
        System.out.println("Rollno = " + d3.rollno);
        System.out.println("Name = " + d3.name);
        System.out.println("Marks = " + d3.marks);

    }
}
