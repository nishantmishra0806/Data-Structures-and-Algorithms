package DSAMaths;

public class FastExponentiation {
    public static void main(String[] args) {
        double result = fastExponentiation(2,7);
        System.out.println(result);

    }

    static double fastExponentiation(int num , int power) {

        double result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result = result * num;
            }
            power /= 2;
            num = num * num;
        }
        return result;
    }
}


