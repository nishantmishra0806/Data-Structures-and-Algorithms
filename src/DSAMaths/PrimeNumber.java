package DSAMaths;

public class PrimeNumber {
    public static void main(String[] args) {
        printPrimeNumber(73);
    }

    static void printPrimeNumber(int n) {
        if(n <= 1){
            System.out.println(n + " is not a prime number.");
        }
        else {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println( n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
        }
    }


}
