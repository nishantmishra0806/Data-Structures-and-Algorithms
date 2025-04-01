package DSAMaths;//import java.util.Scanner;
//
//public class DSAMaths.IntelligenceAgency {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter N:");
//        int n = sc.nextInt();
//        System.out.println("Enter R:");
//        int r = sc.nextInt();
//
//        if( n == 0 && r == 0){
//            System.out.println(0);
//        }
//
//        int resNum = 0;
//        for (int i = 0; i < r; i++) {
//            while(n > 0) {
//                int rem = n % 10;
//                resNum = resNum + rem;
//                n /= 10;
//            }
//            resNum = resNum * r ;
//            n = resNum;
//        }
//
//        while (resNum > 9) {
//
//            int finalNum=0;
//            while(resNum > 0){
//                int rem = resNum % 10;
//                finalNum = finalNum + rem;
//                resNum = resNum / 10;
//            }
//            resNum = finalNum;
//        }
//        System.out.println(resNum);
//    }
//
//}


import java.util.Scanner;

public class IntelligenceAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        System.out.println("Enter R:");
        int r = sc.nextInt();

        // If R is 0, the answer is 0 as per the problem statement
        if (r == 0) {
            System.out.println(0);
            return;
        }

        // Step 1: Find sum of digits of N
        int sumDigits = getDigitSum(n);

        // Step 2: Multiply sum by R
        int resNum = sumDigits * r;

        // Step 3: Reduce the result to a single-digit sum
        resNum = getSingleDigitSum(resNum);

        // Print the final result
        System.out.println(resNum);
        sc.close();
    }

    // Function to get the sum of digits of a number
    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to reduce a number to a single-digit sum
    private static int getSingleDigitSum(int num) {
        while (num > 9) {
            num = getDigitSum(num);
        }
        return num;
    }
}

