package Recursion;

public class Summation1ToN {
    public static void main(String[] args) {
        System.out.println(sum(1, 5));
    }

    static int sum(int i, int n){
        if(i == n){
            return i;
        }
        int suma = i + sum(i+1, n);
        return suma;
    }

    static int sum1(int i, int n, int sum){
        sum(i+1, n, i)
    }
}
