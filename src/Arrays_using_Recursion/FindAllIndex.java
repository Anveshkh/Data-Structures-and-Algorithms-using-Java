package Arrays_using_Recursion;

import java.util.ArrayList;

public class FindAllIndex {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 6, 4, 6};
        int target = 6;
        System.out.println("The required Arraylist is " + findIndex(arr, target, 0));
    }

    static ArrayList findIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findIndex(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
