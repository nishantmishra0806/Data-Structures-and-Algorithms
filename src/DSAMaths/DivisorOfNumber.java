package DSAMaths;

public class DivisorOfNumber {
    public static void main(String[] args) {
        divisorOfNumber(36);
        divisorOfNumberUsingWhile(36);
    }

    //normal method
    static void divisorOfNumber(int n) {

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("divisor of " + n + " :"+ i);
            }
        }
    }

    //optimized method
    static void divisorOfNumberUsingWhile(int n) {
        int counter = 1;
        int sqrt = (int) Math.sqrt(n);
        while (counter <= sqrt) {
            if (n % counter == 0) {
                int otherNumber = n / counter;
                System.out.println("divisor of " + n + " :"+ counter);
                if(otherNumber != counter) {
                System.out.println("divisor of " + n + " :"+ otherNumber);
                }
            }
            counter++;
        }

    }
}
