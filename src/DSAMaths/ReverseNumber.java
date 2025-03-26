package DSAMaths;

public class ReverseNumber {
    public static void main(String[] args) {
           int result = reverse(635627);
           System.out.println(result);
    }

    static int reverse(int num) {
        int revNum = 0;
        while (num > 0) {
            int unitDigit = num % 10;
            revNum = revNum * 10 + unitDigit;
            num = num / 10;
        }
        return revNum;
    }
}
