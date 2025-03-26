package DSAMaths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

           int res = armstrongNumber(number);

        String str = (res == 1) ? "It is an Armstrong Number" : "Not an Armstrong Number";
        System.out.println(str);
    }

    static int armstrongNumber(int n ) {
        int copy = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + (int)Math.pow(rem,3);
            n = n / 10;

        }
        if(sum == copy){
            return 1;
        }
        else {
            return 0;
        }
    }
}
//the program currently checks if a 3 digit num is armstrong or not
//to make it suitable for all number we have to find the length of number and then in place of cube of individual digits we substitute that number
