public class Strings {
    public static void main(String[] args) {
        String name = "Anvesh Khambadkar";
        String name2 = "Anvesh Khambadkar"; //  These 2 variables are pointing to the same object in the stringpool
        System.out.println(name == name2); // It will return true because both the ref variables are pointing to the same object
        System.out.println(name.equals(name2)); // It will also return true because both the value of the object is same

        String a = "Anvesh";
        String b = "Anvesh";
        // Now these ref variables (a and b) are pointing to different objects outside stringpool

        System.out.println(a == b);
        System.out.println(a.equals(b ));
        System.out.println(a.charAt(2));
    }
}
