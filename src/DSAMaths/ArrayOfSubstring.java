package DSAMaths;

import java.util.Scanner;

public class ArrayOfSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        System.out.println("Enter the L :");
        int l = sc.nextInt();
        int count = 0;
        int maxAqua = 0;

        for(int i =0 ; i < str.length() ; i++){
            if(i % l == 0){
                if(count > maxAqua){
                    maxAqua = count;
                    count = 0;
                }
            }
            if(str.charAt(i) == 'a'){
                count ++;
            }
        }

        maxAqua = Math.max(maxAqua, count);
        System.out.println(maxAqua);

    }
}
