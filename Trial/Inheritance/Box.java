package Trial.Inheritance;

public class Box {
    private double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box other){
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
