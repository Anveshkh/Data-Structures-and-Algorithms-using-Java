package Programs;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 7, 1};
        bubble(arr, arr.length-1, 0 );
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int r, int c){
        if(r < 1){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r, c+1);
        }else{
            bubble(arr, r-1, 0);
        }
    }

    public static class No_of_Zeroes {
        public static void main(String[] args) {
            int n = 102030040;
            zeros(n, 0);
        }
        static void zeros(int n, int count){
            if(n == 0){
                System.out.println("The no of zeros is : "+ count);
                return;
            }
            int rem = n % 10;
            if(rem == 0){
                count++;
            }
            zeros(n/10, count);

        }
    }
}
