package leetcode;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // key:integer; value:index

        for (int i = 0; i<nums.length; i++) {
            int get = target-nums[i];
            if (map.containsKey(get)) {
                return new int[] {map.get(get), i}; // [index of get, i (index)]
            }
            map.put(nums[i], i);
        }
        return null;
    }



    /*
    // First in brute force
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i<nums.length; i++) {
            for (int j = i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }*/
}
