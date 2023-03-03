package Trial;

public class P2 {
    int rollno;
    String name;
    static int population ;

    P2(){
        this.rollno = 28;
        this.name = "Random";
        population += 1;
    }

    P2(int r, String n){
        this.rollno = r;
        this.name = n;
        P2.population += 1;
    }

    void display(){
        System.out.println("Population is :- " + P2.population);
    }

}
