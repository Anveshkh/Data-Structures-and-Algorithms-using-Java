package Recursion;

import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
        int[] arr= {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        sequences(arr, 0, list);
    }

    static void sequences(int[] arr, int index, ArrayList<Integer> list){
         if(index == arr.length){
             System.out.println(list);
             return;
         }


         sequences(arr, index+1, list);
         list.add(arr[index]);

         sequences(arr, index+1, list);
        list.remove(arr[index]);
    }
}
