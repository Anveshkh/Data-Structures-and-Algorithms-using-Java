package dsa_leetcode;

// Given a matrix M rotate the matrix by 90 degree towards right

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        rotateby90(arr);
        print(arr);
    }

    static void print(int[][] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void rotateby90(int[][] arr){
        // First we find the transpose of the matrix

        for(int i = 0; i<arr.length-1; i++){
            for(int j= i + 1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // now we will swap the last col with first col and last second col with second col

        int left = 0;
        int right = arr[0].length-1;

        while(left < right){
            for(int i = 0; i<arr.length; i++){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }
    }
}
