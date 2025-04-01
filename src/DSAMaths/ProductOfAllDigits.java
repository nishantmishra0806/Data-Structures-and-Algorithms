package DSAMaths;

import java.util.Scanner;

public class ProductOfAllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int length = (num == 0) ? 1 : (int) Math.log10(num) + 1;
        int res =1;
        /*for (int i = 0; i < length; i++) {
            int rem = num % 10;
            res *= rem;
            num /= 10;

        }*/

        while(num > 0){
            int rem = num % 10;
            res *= rem;
            num /= 10;
        }

        System.out.println(res);

    }
}
