package DSAMaths;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {0,2,1,0,1,2,0,1,2,1,0,0,2};
        sort(arr);
    }

    public static void sort(int[] a) {
        int n = a.length;

        // Bubble sort: Iterate through the array and swap elements if they are in the wrong order
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare elements up to n - i - 1 (elements after i are already sorted)
            for (int j = 0; j < n - 1 ; j++) {
                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(a));
    }
}
