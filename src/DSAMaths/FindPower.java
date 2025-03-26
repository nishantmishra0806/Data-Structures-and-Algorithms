package DSAMaths;

public class FindPower {
    public static void main(String[] args) {
         double result = findPower(4,2);
        System.out.println(result);
    }

    static double findPower(int num , int power) {
            double result = 1;
        for (int i = 1; i <= power; i++) {
           result = result * num;
        }
           return result;
    }
}
