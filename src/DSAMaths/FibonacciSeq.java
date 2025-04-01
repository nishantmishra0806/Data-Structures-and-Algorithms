package DSAMaths;

import java.util.Scanner;

public class FibonacciSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fibonacci(num);
    }

    public static void fibonacci(int n) {

        int f1 = 0, f2 = 1;
        for (int i = 1; i <= n; i++) {

            System.out.print(f1 + " ");

            int next = f1 + f2;
            f1 = f2;
            f2 = next;

        }
    }
}
