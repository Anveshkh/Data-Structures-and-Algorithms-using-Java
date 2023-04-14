package Recursion;

import OOP.AccessControl.A;

import java.util.ArrayList;

public class SumWithK {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        int sum = 2;
        ArrayList<Integer> list = new ArrayList<>();
        func(0, list, arr, sum, 0);
    }

    static void func(int index, ArrayList list, ArrayList arr, int sum, int currsum){
        if(index >= arr.size()) {
            if(currsum == sum){
                System.out.println(list);
            }
            return;
        }
        // selecting element at that index
        currsum = currsum +  (int)arr.get(index);
        list.add(arr.get(index));
        func(index+1, list, arr, sum, currsum);
        // Not selecting element at that index
        list.remove(arr.get(index));
        currsum -= (int)arr.get(index);
        func(index+1, list, arr, sum, currsum);
    }
}
