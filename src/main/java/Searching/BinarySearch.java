package Searching;

public class BinarySearch {
    public static void main(String [] args){
        //https://leetcode.com/problems/binary-search/description/

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(nums, target));

        int target1 = 2;

        System.out.println(search(nums, target1));
    }

    private static int search(int[] nums, int target) {
        int l=0, h=nums.length-1;
        while (l<=h){
            int m = (l+h)/2;
            if (nums[m] == target){
                return m;
            } else if (nums[m] < target) {
                l = m+1;
            }else {
                h = m-1;
            }
        }
        return -1;
    }
}
