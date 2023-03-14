package Programs;

import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 6, 4, 6};
        int target = 6;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(arr, target, 0, list));
    }

    static ArrayList findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }
}
