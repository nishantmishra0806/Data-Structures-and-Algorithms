package DSAMaths;

public class DigitCount {
    public static void main(String[] args) {
        int res = digitCount(365373);
        System.out.println(res);

        int resLog = countDigitsLog(365373);
        System.out.println(resLog);
    }

    static int digitCount(int num ) {
        int count = 0;
        if(num == 0) {
            System.out.println("Only number present is : 0");
        }
        else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
        return count;
    }

    public static int countDigitsLog(int num) {
          int count = 0;
        if(num == 0) {
            System.out.println("Only number present is : 0");
        }
        else {
            //java by default provide logE(num) but here we need log10(num)
             //count = (int)Math.log(num) + 1 ;
            count = (int)(Math.log(num)/Math.log(10) + 1) ;

        }
          return count;
    }
}
