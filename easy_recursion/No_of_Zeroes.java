package easy_recursion;

public class No_of_Zeroes {
    public static void main(String[] args) {
        int n = 102030040;
        zeros(n, 0);
    }
    static void zeros(int n, int count){
        if(n == 0){
            System.out.println("The no of zeros is : "+ count);
            return;
        }
        int rem = n % 10;
        if(rem == 0){
            count++;
        }
        zeros(n/10, count);

    }
}
