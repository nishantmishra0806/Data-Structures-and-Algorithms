package DSAMaths;

import java.util.*;

public class AllAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Implementing case Insensitive
        String str = sc.nextLine().toLowerCase();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> list = new HashSet<>();
        for (int i = 0; i < alphabet.length(); i++) {
           char ch = alphabet.charAt(i);
           list.add(ch);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(list.contains(ch)) {
                //review this
                list.remove(Character.valueOf(ch));
            }
        }

        if (list.isEmpty()) {
            System.out.println("0");
        }

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "");
        }
    }

}
