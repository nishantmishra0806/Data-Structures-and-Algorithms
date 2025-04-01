package DSAMaths;

public class LCMandHCF {

    public static void main(String[] args) {
        System.out.println(" LCM ->" +lcm(72,120));
        System.out.println(" GCD ->" +gcd(72,120));

    }

    public static int lcm(int a, int b) {
        int lcm = (a > b) ? a : b;
       /*
        optimized solution
        int res = (a*b)/gcd(a,b);
                */
        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                break;
            }
            lcm++;
        }

        return lcm;
    }

    public static int gcd(int a, int b) {

        int gcd = (a > b) ? b : a ;
        while(gcd > 0){
            if(a % gcd == 0 && b % gcd == 0){
                break;
            }
            gcd--;
        }
        return gcd;
    }

}
