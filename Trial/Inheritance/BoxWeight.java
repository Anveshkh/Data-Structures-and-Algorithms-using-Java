package Trial.Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double l, double w, double h, double weight){
        super(l,h,w); // call the parent class constructor
        this.weight = weight;
    }
}
