package DSAMaths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int reverse = palindromeNumber(146383);
        System.out.println(reverse == 1 ? "Palindrome Number" : "Not a palindrome number");
    }

    static int palindromeNumber(int n) {
        int number = n;
        int revNumber = 0;
        while(n > 0) {
            int unitDigit = n % 10;
            revNumber = revNumber * 10 + unitDigit;
            n /= 10;

        }
       return (revNumber == number) ? 1 : 0;
    }
}
