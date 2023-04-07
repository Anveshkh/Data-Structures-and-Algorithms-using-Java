package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(4);
        set.add(3);
        set.add(4);
        set.add(1);

        System.out.println(set.contains(1));
        System.out.println("size of set is :- " + set.size());
        System.out.println(set);

        Iterator it = set.iterator();

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
//        System.out.println(it.next());
        System.out.println("hello");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(it.hasNext());
    }
}
