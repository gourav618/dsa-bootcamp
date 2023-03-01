package Searching;

public class PeakElement {
    public static void main(String[] args){
        //https://leetcode.com/problems/find-peak-element/

        int[] nums = {1,2,3,1};

        System.out.println(findPeakElement(nums));

        int[] nums1 = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(nums1));

        int[] nums2 = {2,1};
        System.out.println(findPeakElement(nums2));

    }

    private static int findPeakElement(int[] nums) {
        int l = 0, h = nums.length-1;
        while (l<=h){
            int m = (l+h)/2;

            if (nums.length == 1){
                return m;
            }
            if (m == nums.length - 1 && nums[m] > nums[m - 1]) {
                return m;
            } else if (m == 0 && nums[m] > nums[m + 1]) {
                return m;
            }else if (nums[m] > nums[m+1] && nums[m] > nums[m-1]){
                return m;
            }
            else if (nums[m] > nums[m+1]) {
                h = m-1;
            }else {
                l = m+1;
            }
        }
        return -1;
    }
}
