import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        for(int i = 2; i<n; i++){
            primes[i] = true;
        }
        sieve(n, primes);
        System.out.println(Arrays.toString(primes) );
    }

    static void sieve(int n, boolean[] primes){
        for(int i = 2; i*i <= n; i++){
            if(isPrime(i)){
                primes[i] = true;
                for(int j = i*2; j<= n; j+=i){
                    primes[j] = false;
                }
            }
        }
    }

    static boolean isPrime(int num){
        int c = 2;
        while(c*c <= num){
            if(num%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
