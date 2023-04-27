package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GridTraveller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows :- ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns :- ");
        int c = sc.nextInt();

        System.out.println(func(r,c));
    }

    static int func(int r, int c){
        HashMap<List, Integer> map = new HashMap<List, Integer>();
        List<Integer>list = new ArrayList();
        list.add(r);
        list.add(c);


        if(r == 0 || c == 0) return 0;
        if(r == 1 && c == 1) return 1;
        if(map.containsKey(list)) return map.get(list);

        // Down


        int val = func(r-1, c) + func(r, c-1);
        map.put(list, val);
        return val;
    }
}
