package DSAMaths;

import java.util.HashSet;
import java.util.Set;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] a ={16,17,4,3,5,2};
        leaderInArray(a);


    }

    public static void leaderInArray(int[] nums) {
           int[] result;
        for (int i = 0; i < nums.length; i++) {
            int flag = 1;
            for (int j = i + 1; j < nums.length; j++) {
               if(nums[j] > nums[i]) {
                   flag = 0;
                   break;
               }
            }
            if (flag == 1) {
                System.out.println(nums[i] + " is the leader");
            }
        }
    }
}
