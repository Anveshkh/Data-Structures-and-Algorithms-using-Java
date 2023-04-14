package Recursion;

// Check if the given string is pallindrome or not

public class PallindromeString {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(check(0, s));
    }

    static boolean check(int index, String s){
        if(index == s.length()/2) return true;
        if(s.charAt(index) != s.charAt(s.length()-index-1)) return false;
        return check(index+1, s);

    }
}
