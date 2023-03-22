package Subset_using_Recursion;

public class Program1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("aaouchaaa");
        StringBuilder ans = remove(builder, 0);
        StringBuilder ans1 = remove1("baccad", 0, new StringBuilder(""));

        System.out.println("Answer of function 1 is : " + ans);
        System.out.println("Answer of function 2 is : " + ans1);
    }

    static StringBuilder remove(StringBuilder sc, int index){
        if(index == sc.length()){
            return sc;
        }
        if(sc.charAt(index) == 'a'){
            sc.deleteCharAt(index);
            return remove(sc, index);
        }
        return remove(sc, index+1);
    }
    static StringBuilder remove1(String original, int index,  StringBuilder ans){
        if(index == original.length()){
            return ans;
        }
        if(original.charAt(index) == 'a'){
            return remove1(original, index+1, ans);
        }
        else{
            ans.append(original.charAt(index));
            return remove1(original, index+1, ans);
        }
    }
}
