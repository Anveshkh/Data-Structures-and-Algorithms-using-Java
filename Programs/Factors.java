package Programs;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1; i<=20; i++){
            if(n % i == 0){
                System.out.println(i + " divides " + n);
            }
        }
    }
}
