package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SumWithK2 {
    static int[] arr = {1,2,1};

    public static void main(String[] args) {
        int sum = 2;
        ArrayList<Integer> list = new ArrayList<>();
        func(0, list, arr.length, sum, 0);
    }


    static void func(int index, ArrayList<Integer> list, int len, int sum, int currsum){
        if(index == len){
            if(currsum == sum){
                System.out.println(list);
            }
            return;
        }
        // Selecting the element at index
        list.add(arr[index]);
        currsum += arr[index];
        func(index+1, list, len, sum, currsum);

        // We are not selecting current element
        list.remove(arr[index]);
        currsum -= arr[index];

        func(index+1, list, len, sum, currsum);
    }
}
