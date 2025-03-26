package DSAMaths;
//to find prime between the given range using -  Sieve of Eratosthenes

import java.util.Arrays;

public class SieveAlgorithm {
    public static void main(String[] args) {
        sieve(40);
    }

    public static void sieve(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        for (int counter = 2; counter * counter <= n; counter++) {
            if (primes[counter]) {
                for (int factor = counter * counter; factor <= n; factor += counter) {
                    primes[factor] = false;
                }
            }
        }


        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
