package DSAMaths;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("false");
        }

        if(s1.length() == s2.length()){
            /*for(int i = 0; i < s1.length(); i++){
                char ch= s1.charAt(i);
                str1[i] = ch;
            }*/

           /* for(int i = 0; i < s2.length(); i++){
                char ch= s2.charAt(i);
                str2[i] = ch;
            }*/

            char[] str1 = s1.toCharArray();
            char[] str2= s2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            /*char[] sorteds1 = str1.clone();
            char[] sorteds2 = str2.clone();
            Arrays.sort(sorteds1);
            Arrays.sort(sorteds2);*/

            /*if (Arrays.equals(str1, str2)) {
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }*/

            System.out.println(Arrays.equals(str1, str2));
        }

    }
}
