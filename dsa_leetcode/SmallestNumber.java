package dsa_leetcode;

// Given a number 'N' find the smallest number such that the product of thier digits is equal to N

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = smallest(n);
        System.out.println(ans);
    }

    static int smallest(int n){
        String ans = "";
        for(int i = 9; i>=2; i--){
            while(n % i == 0){
                n = n / i;
                ans = i+ ans;
            }
        }
        if(n != 1){
            return -1;
        }
        else{
            return Integer.parseInt(ans);
        }
    }
}
