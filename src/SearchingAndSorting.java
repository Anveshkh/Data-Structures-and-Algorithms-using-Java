import java.util.Arrays;

public class SearchingAndSorting {
    public static void main(String[] args) {
        int[] arr= {1, 32, 4, 56 ,3, 655, 76, 559};
        int target = 655;
//        LinearS(arr, target);
        BinaryS(arr, target);
    }

    static void LinearS(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Target found at index :- "+ i);
                return;
            }
        }
        System.out.println("Target element not found in array.");
    }

    static void BinaryS(int[] arr, int target){
        // First making the array sorted
        int[] sortedArray_Bubble = BubbleSort(arr);
        int[] sortedArray_Insertion = InsertionSort(arr);
        int[] sortedArray_Selection = SelectionSort(arr);
        int[] sortedArray_Quick = QuickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array using Bubble sort is:- "+ Arrays.toString(sortedArray_Bubble));
        System.out.println("Sorted array using Insertion sort is:- "+ Arrays.toString(sortedArray_Insertion));
        System.out.println("Sorted array using Selection sort is:- "+ Arrays.toString(sortedArray_Selection));
        System.out.println("Sorted array using Quick sort is:- "+ Arrays.toString(sortedArray_Quick));
        int start=0, end=sortedArray_Quick.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target > sortedArray_Quick[mid]){
                start = mid+1;
            }
            else if(target < sortedArray_Quick[mid]){
                end = mid-1;
            }
            else{
                System.out.println("Target found at index:- " + mid);
                break;
            }
        }
    }

    static int[] BubbleSort(int[] arr){
        int i,j;
        for(i=0; i<arr.length-1; i++){
            for(j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    static int[] InsertionSort(int[] arr){
        int i;
        for(i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    static int[] SelectionSort(int[] arr){
        int i,j;
        for(i=0; i<arr.length-1; i++){
            for(j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static int[] QuickSort(int[] arr, int lb, int ub){
        if(lb<ub){
            int loc = Partition(arr, lb, ub);
            QuickSort(arr, lb, loc-1);
            QuickSort(arr, loc+1, ub);
        }
        return arr;
    }

    static int Partition(int[] arr, int lb, int ub){
        int pivot = arr[lb];
        int p=lb, q=ub;
        while(p<q){
            while(arr[p] <= pivot){
                p++;
            }
            while(arr[q] > pivot){
                q--;
            }
            if(p<q){
                // swap p and q
                int temp = arr[p];
                arr[p] = arr[q];
                arr[q] = temp;
            }
        }
        int temp = pivot;
        arr[lb] = arr[q];
        arr[q] = temp;
        return q;
    }
}
