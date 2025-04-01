package DSAMaths;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted array elements :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search : ");
        int num = sc.nextInt();
        binarySearch(arr , num);
    }

    public static void binarySearch(int[] arr , int num) {
        int key = num;
        int low = 0;
        int high = arr.length - 1;
        int mid = (int)(low + high) / 2;
        while(low < high){
            if(arr[mid] == key){
                System.out.println("Element found at index " + (mid + 1));
                break;
            }
            else if(arr[mid] < key){
                low = mid + 1;



            }
            else{
                high = mid - 1;
            }


        }
    }
}
