package DSAMaths;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] a = {1,2,1,3,5,4,3,4,5,2,3};
        Set<Integer> set = removeDuplicates(a);
        System.out.println(set);
        System.out.println("The number of unique elements are : " + set.size());

    }

    public static Set<Integer> removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        else{
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }
            return set;
        }
    }
}
