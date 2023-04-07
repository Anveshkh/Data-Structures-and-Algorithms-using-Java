package HashMap;


import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("Japan", 70);
        map.put("Germany", 80);
        map.put("Vietnam", 10);
        map.put("America", 120);

        // No order is followed while printing
        System.out.println(map);

        map.put("India", 200);
        System.out.println(map);

        // Search
        if(map.containsKey("Vietnam")){
            System.out.println("Vietnam is present in HashMap");
        }else{
            System.out.println("Vietnam is not present in Hashmap");
        }

        // Getting value of any key

        System.out.println(map.get("India"));
        System.out.println(map.get("Pakistan"));
        System.out.println(map);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Printing using old syntax");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // same can be done through for each loop
        // we use this loop when we have to traverse through a collection

        System.out.println("Printing using new Syntax");
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
