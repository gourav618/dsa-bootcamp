package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args){
        //https://leetcode.com/problems/subsets/

        int[] nums = {1,2,3};

        List<List<Integer>> subsets = subsets(nums);
        subsets.forEach(System.out::println);
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        int[] temp = new int[nums.length];
        getAllSubSet(nums, temp, subsets, 0, 0);
        return subsets;
    }

    private static void getAllSubSet(int[] nums, int[] temp, List<List<Integer>> subsets, int i, int sz) {
        if (i == nums.length){
            List<Integer> arr = new ArrayList<>();
            for (int k=0; k<sz; k++){
                arr.add(temp[k]);
            }
            subsets.add(arr);
            return;
        }
        //if we select ith element
        temp[sz] = nums[i];
        getAllSubSet(nums, temp, subsets, i+1, sz+1);
        //if we don't select ith element
        getAllSubSet(nums, temp, subsets, i+1, sz);
    }
}
