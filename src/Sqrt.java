import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.println(sqrt(n,p));
    }

    static float sqrt(int n, int p){
        int start = 1;
        int end = n;
        float root = 0.0F;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid * mid == n){
                return mid;
            }
            else if(mid * mid < n){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        float incr = 0.1f ;
        for(int i = 0; i<p; i++){
            while(root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
