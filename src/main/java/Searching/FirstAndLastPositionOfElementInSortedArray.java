package Searching;

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args){
        //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ints = searchRange(nums, target);
        Arrays.stream(ints).forEach(i -> System.out.print(i+" "));

        target = 6;
        int[] ints1 = searchRange(nums, target);
        Arrays.stream(ints1).forEach(i -> System.out.print(i+" "));

        target = 0;
        int[] ints2 = searchRange(nums, target);
        Arrays.stream(ints2).forEach(i -> System.out.print(i+" "));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};

        int firstOccurrence = getFirstOccurrence(nums, target);
        range[0] = firstOccurrence;
        int lastOccurrence = getLastOccurrence(nums, target);
        range[1] = lastOccurrence;

        return range;
    }

    private static int getLastOccurrence(int[] nums, int target) {
        int l = 0, h = nums.length-1;
        while (l<=h){
            int m = l + (h-l)/2;
            if (nums[m] < target){
                l = m+1;
            } else if (nums[m] > target) {
                h = m-1;
            }else {
                if (m == nums.length-1) return m;
                if (nums[m+1] != target)
                    return m;
                l = m+1;
            }
        }
        return -1;
    }

    private static int getFirstOccurrence(int[] nums, int target) {
        int l = 0, h = nums.length-1;
        while (l<=h){
            int m = l + (h-l)/2;
            if (nums[m] < target){
                l = m+1;
            } else if (nums[m] > target) {
                h = m-1;
            }else {
                if (m == 0) return m;
                if (nums[m-1] != target)
                    return m;
                h = m-1;
            }
        }
        return -1;
    }
}
