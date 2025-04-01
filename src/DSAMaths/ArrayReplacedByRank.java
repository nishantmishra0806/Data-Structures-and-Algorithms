package DSAMaths;/*
import java.util.*;

public class DSAMaths.ArrayReplacedByRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sortedArr = new int[n];
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);

        int ranking = 1;
        for (int i = 0; i < n -1 ; i++) {
            if(sortedArr[i] != sortedArr[i + 1]) {
                rank[i] = ranking ;
                ranking++;
            }
            else{
                rank[i] = ranking;
            }
        }
        rank[n-1] = ranking;



        // Print the transformed array
        for (int num : rank) {
            System.out.print(num + " ");
        }
    }
}
*/

import java.util.*;

public class ArrayReplacedByRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sortedArr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sortedArr[i] = arr[i];
        }

        // int[] copy = arr.clone();

        Arrays.sort(sortedArr);

        // Map to store ranks of unique elements
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int value : sortedArr) {
            if (!rankMap.containsKey(value)) {
                rankMap.put(value, rank++);
            }
        }

        // Replace elements in original array with their rank
        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        // Print the transformed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



/*
import java.sql.SQLOutput;
import java.util.*;

public class DSAMaths.ArrayReplacedByRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int count = 1;
        for (int i = 0; i < n; i++) {
            map.put(arr[i] , count );
            count++;
        }

        for(int i= 0 ; i < arr.length ; i++) {
            if(map.containsKey(arr[i])) {
                arr[i] = map.get(arr[i]);
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }

    }
}
*/
