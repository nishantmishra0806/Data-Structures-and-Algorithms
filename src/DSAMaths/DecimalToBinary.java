package DSAMaths;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(43));
    }

    public static int decimalToBinary(int num) {
        int result = 0;
        int power =0;
        while (num > 0) {

            int rem = num % 2;
            num = num / 2;
            result +=  rem * Math.pow(10,power);
            power++;

        }

    return result;
    }


}
