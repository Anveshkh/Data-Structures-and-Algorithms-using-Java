package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:- ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0; i<arr.length; i++){
            arr[i] = -1;
        }
        System.out.println(fibo(n, arr));
    }

    static int fibo(int n, int[] arr){
        if(arr[n] != -1) return arr[n];
        if(n <= 2){
            return 1;
        }
        arr[n] = fibo(n-1, arr) + fibo(n-2, arr);
        return arr[n];
    }
}
