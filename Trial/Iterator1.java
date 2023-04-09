package Trial;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1,1,2,2,3,4,55,55};
        for(int i = 0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int[] temp = new int[arr.length];
        Iterator it = set.iterator();
        int i = 0;
        while(it.hasNext()){
            temp[i++] = (int)it.next();
        }
        System.out.println(Arrays.toString(temp));

    }
}
