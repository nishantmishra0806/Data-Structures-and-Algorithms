package DSAMaths;

import java.util.Scanner;

public class EmptyPacketPushback {

        public static void main(String[] a){

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0 ; i< n ; i++){
                arr[i] = sc.nextInt();
            }

            int [] secArr = new int[n];
            int index =0;
            for(int i = 0 ; i < n-1 ; i++){
                if(arr[i] != 0)
                {
                   secArr[index] = arr[i];
                   index++;
                }
            }

            for(int i : secArr){
                System.out.print(i + " ");
            }

        }
}
