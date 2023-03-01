package Searching;

public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        //https://leetcode.com/problems/search-in-rotated-sorted-array/

        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(nums, target));

        target = 3;
        System.out.println(search(nums, target));

        int[] nums1 = {3,1};
        target = 1;
        System.out.println(search(nums1, target));
    }

    private static int search(int[] nums, int target) {
        int pivot = findPivot(nums, nums.length);
        if (pivot == -1){//arr sorted no pivot
            return binarySearchOnRange(nums, 0, nums.length-1, target);
        }else {//pivot found
            int leftSearch = binarySearchOnRange(nums, 0, pivot, target);
            int rightSearch = binarySearchOnRange(nums, pivot+1, nums.length-1, target);
            return leftSearch == -1 ? rightSearch : leftSearch;
        }
    }

    private static int binarySearchOnRange(int[] nums, int l, int h, int target) {
        while (l <= h){
            int m = (l+h)/2;
            if (nums[m] == target){
                return m;
            } else if (nums[m] <= target) {
                l = m+1;
            }else {
                h = m-1;
            }
        }
        return -1;
    }

    private static int findPivot(int[] nums, int N) {
        int l = 0, h = N-1;
        while (l<=h){
            int m = (l+h)/2;
            if (nums[m] <= nums[N-1]){
                h = m-1;
            }else {
                if (nums[m] <= nums[m+1]){
                    l = m+1;
                }else {
                    return m;
                }
            }
        }
        return -1;
    }
}
