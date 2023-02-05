import java.util.Scanner;

public class Recursion1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Search for nth Fibonacci number:- ");
        int number = input.nextInt();
        int ans = Fibo(number);
        if(ans==-1){
            System.out.println("Enter positive numbers");
        }
        else{
            System.out.println(ans);
        }

    }

    static int Fibo(int num){
        if(num > 0){
            if(num < 3){
                return num-1;
            }

            return Fibo(num-1) + Fibo(num-2);
        }
        return -1;
    }


}
