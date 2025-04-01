package DSAMaths;

import java.util.Scanner;

public class PalindromeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        plaindrome(num);
    }

    public static void plaindrome(int num) {
        int orgnum = num;
        int revNum = 0;
        while(num >0){
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;

        }
        System.out.println(orgnum);
        System.out.println(revNum);
        if(revNum == orgnum) {

            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

}
