package DSAMaths;

import java.util.ArrayList;
import java.util.Scanner;

public class SpaceAndCommaSeperatedInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.startsWith("[") && s.endsWith("]")) {
            s = s.substring(1 , s.length() -1);
        }

        String[] str = s.split(" ");
        String[] str1 = s.split(",");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < str1.length; i++) {
            int num= Integer.parseInt(str1[i]);
            list.add(num);
        }

        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}
