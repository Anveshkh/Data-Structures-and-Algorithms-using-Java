package Programs;

public class Recursion2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78,92};
        int target = 78 ;
        System.out.println(arr.length);
        int ans = RecursiveBS(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    static int RecursiveBS(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return RecursiveBS(arr, target, start, mid-1);
        }

        return RecursiveBS(arr, target, mid+1, end);
    }
}
