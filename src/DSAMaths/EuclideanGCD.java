package DSAMaths;

public class EuclideanGCD {
    public static void main(String[] args) {

        System.out.println(gcd(24,36));
        System.out.println(efficientEuclideanGCD(24,36));
    }

    public static int gcd(int a, int b) {
        while(a!= 0 && b!= 0) {
            if(a> b){
                a -= b;
            }
            else {
                b -= a;
            }
        }
        int res = (a == 0) ? b : a ;
        return res;
    }
    public static int efficientEuclideanGCD(int a, int b) {
        while(a!= 0 && b!= 0) {
            if(a> b){
                // '-' is replaced by '%'
                a %= b;
            }
            else {
                // '-' is replaced by '%'
                b %= a;
            }
        }
        int res = (a == 0) ? b : a ;
        return res;
    }
}
