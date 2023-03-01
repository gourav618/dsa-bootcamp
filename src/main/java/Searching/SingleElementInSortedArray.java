package Searching;

public class SingleElementInSortedArray {
    public static void main(String[] args){
        //https://leetcode.com/problems/single-element-in-a-sorted-array/

        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));

        int[] nums2 = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums2));
    }

    private static int singleNonDuplicate(int[] nums) {
        int l=0, h=nums.length-1;

        if (l == h){//if nums have 1 element in array
            return nums[0];
        }
        while (l<=h){
            int m = (l+h)/2;

            if (m == 0){
                if (nums[m] != nums[m+1]){
                    return nums[m];
                }
            } else if (m == nums.length - 1) {
                if (nums[m] != nums[m-1]){
                    return nums[m];
                }
            } else if (nums[m] != nums[m - 1] && nums[m] != nums[m + 1]) {
                return nums[m];
            }else {
                int firstOcc;
                if (nums[m] == nums[m-1]){
                    firstOcc = m-1;
                }else {
                    firstOcc = m;
                }

                if (firstOcc % 2 == 0){
                    l = m+1;
                }else {
                    h = m-1;
                }
            }
        }
        return -1;
    }
}
