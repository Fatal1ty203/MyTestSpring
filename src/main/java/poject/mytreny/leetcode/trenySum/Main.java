package poject.mytreny.leetcode.trenySum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] ints = Solution.twoSum(new int[]{2,5,5,11}, 10);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }


}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        for (int j = 0; j < nums.length -1; j++ ){
            System.out.println("j = " +j);
            for (int k = j+1; k < nums.length;){
                System.out.println("k = " +k);
                if (nums[j] + nums[k] == target){
                    result[0] = j;
                    result[1] = k;
                }
                k++;
            }

        }
        return result;
    }
}
