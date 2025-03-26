package DSAMaths;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        System.out.println(decimalToAnyBase(24,8));

    }

    static int decimalToAnyBase(int num , int base) {
        int result = 0;
        int power = 0;
        while (num > 0) {
            int rem = num % base;
            num = num / base;
            result +=  rem * Math.pow(10,power);
            power++;
        }
        return result;
    }
}
