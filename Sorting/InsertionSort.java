package Sorting;

public class InsertionSort {
    public static void Insertion(int[] arr){

        int i,j,key;
        System.out.println("Sorting elements using Insertion Sort technique");
        for(i = 1; i<arr.length-1; i++){
            key = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
