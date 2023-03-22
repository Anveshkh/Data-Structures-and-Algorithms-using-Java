package Programs;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // Ascii values are added
        System.out.println("a"+"b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1); // This is same as after few steps "a" + "1"
        System.out.println("Anvesh" + new ArrayList<>());
        System.out.println("Anvesh" + 'k');

    }
}
