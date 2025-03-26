package DSAMaths;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(101));
        System.out.println(AnyBaseToDecimal(101,2));

    }

    static int AnyBaseToDecimal(int binaryNum , int base) {
        int result = 0;
        int power = 0;
        while (binaryNum > 0) {

            int unitDigit = binaryNum % 10;
            binaryNum = binaryNum / 10;
            result +=  unitDigit * Math.pow(base,power);
            power++;
        }
        return result;
    }

   static int binaryToDecimal(int binaryNum) {
        int result = 0;
        int power = 0;
         while (binaryNum > 0) {

             int unitDigit = binaryNum % 10;
             binaryNum = binaryNum / 10;
             result +=  unitDigit * Math.pow(2,power);
             power++;
         }
         return result;
   }
}
