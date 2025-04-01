package DSAMaths;

import java.util.Scanner;

public class PriorGreaterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
/*
        int count = 0;

        for (int i=n-1; i >= 0; i--) {
            boolean res = true;
            for(int j =i ; j >= 0 ; j--){
                if (!(arr[i] >= arr[j])) {
                   res = false;
                   break;
                }

            }
            if(res){ count++;}

        }*/

        //max method
        int max =0 ;
        int count = 0;
        for(int i =0 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
                count ++;
            }
        }

        System.out.println(count);
    }

}



