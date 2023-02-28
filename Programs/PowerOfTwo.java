package Programs;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            int last_digit = n & 1;
            if(last_digit == 1){
                count++;
            }
            n = n >> 1;
        }
        if(count == 1){
            System.out.println("Success!! Power of 2");
        }
        else{
            System.out.println("OOPS! Failure");
        }
    }
}
