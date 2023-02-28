package Programs;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
       pattern1();
       pattern2();
       pattern3();
       pattern4();
       pattern5();
    }

    static void pattern1(){
        System.out.println("Printing pattern1");
        System.out.println();
        int i,j;
        for(i = 0; i<5; i++){
            for(j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(){
        System.out.println("Printing pattern 2");
        System.out.println();
        int i, j;
        for(i = 5; i>0; i--){
            for(j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(){
        System.out.println("Printing pattern 3");
        System.out.println();
        int i,j,k;
        for(i=0; i<5; i++){
            for(j = 0; j<4-i; j++){
                System.out.print(" ");
            }
            for(k=4-i; k<5; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern4(){
        System.out.println("Printing pattern 4");
        System.out.println();
        int i,j, count=1;
        int size = 5;
        for(i=0; i<size; i++){
            for(j=0; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

        for (i=size+1; i>0; i--){
            for(j=0; j<i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }
    static void pattern5(){
        System.out.println("Printing pattern 5");
        System.out.println();
        int i,j, size=5;
        for(i=0; i<size; i++){
            int col_size = 15;
            for(j=0; j<15; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
