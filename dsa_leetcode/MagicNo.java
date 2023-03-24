package dsa_leetcode;

public class MagicNo {
    public boolean Magic(int n){
        int slow = n;
        int fast = n;

        do{
            slow = square(n);
            fast = square(square(n));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

    private int square(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem * rem;
            n = n/10;
        }
        return ans;
    }
}
