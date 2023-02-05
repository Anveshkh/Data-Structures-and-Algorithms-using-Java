package easy_recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int target = 18;
        System.out.println(search(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
    }

    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
}
