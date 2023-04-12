package dsa_leetcode;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8,}, {9,10,11,12}, {13,14,15,16}};
        printmatrix(arr);
    }
    static void printmatrix(int[][] arr){
        int count = 0;
        int r = arr.length;
        int c = arr[0].length;
        int rmin = 0, rmax = r-1, cmin = 0, cmax = c-1;

        while(count < c*r){
            for(int col = cmin; col<=cmax; col++){
                System.out.print(arr[rmin][col] + " ");
                count++;
            }
            rmin++;
            for(int row = rmin; row<= rmax; row++){
                System.out.print(arr[row][cmax] + " ");
                count++;
            }
            cmax--;
            for(int col = cmax; col>= cmin; col--){
                System.out.print(arr[rmax][col] + " ");
                count++;
            }
            rmax--;
            for(int row = rmax; row>= rmin; row--){
                System.out.print(arr[row][cmin] + " ");
                count++;
            }
            cmin++;
        }
    }
}
