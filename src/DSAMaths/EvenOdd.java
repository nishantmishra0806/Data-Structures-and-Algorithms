package DSAMaths;

public class EvenOdd {
    public static void main(String[] args) {
        evenOdd(5);
        evenOdd(-5);
        evenOdd(10);
    }

 static void evenOdd(int num) {

        if(num >= 0 ){
            if(num % 2 == 0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
        else{
            System.out.println("invalid");
        }
 }
}
