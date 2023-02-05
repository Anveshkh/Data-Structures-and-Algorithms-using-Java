import java.util.Scanner;

public class PowerOfTwo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        int ans = n & (n-1);
        if(ans == 0) {
            System.out.println("Success!! Power of 2");
        }
        else{
            System.out.println("OOPS! Failure :(");
        }
    }
}
