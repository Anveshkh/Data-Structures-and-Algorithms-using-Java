package Arrays_using_Recursion;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        for(int i = 0; i<10; i++){
            list.add(i*i);
        }

        for(int i = 0; i<10; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.remove(5);
        System.out.println(list);

        list.add(5, 25); // adding 25 at index no 5
        System.out.println(list);


    }
}
