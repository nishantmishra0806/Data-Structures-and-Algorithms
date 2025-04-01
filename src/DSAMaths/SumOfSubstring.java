package DSAMaths;

import java.util.Scanner;

public class SumOfSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        // Clear the buffer before reading the next line for the string
        sc.nextLine();  // This consumes the newline left by nextInt()

        String str = sc.nextLine();

        int count = 0;

        if (str.isEmpty()) {
            System.out.println("Empty String");
        }
        else {

            for (int i = 0; i < str.length(); i++) {
                int sum = 0;
                for (int j = i; j < str.length(); j++) {
                    //subtracting 0 so that it will convert into integer
                    sum += str.charAt(j) - '0';
                    // Check if the sum is equal to the length of the substring
                    if (sum == (j - i + 1)) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}