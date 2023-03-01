package Searching;

public class SearchInsertPosition {
    public static void main(String[] args){
        //https://leetcode.com/problems/search-insert-position/

        /*when m at last index and key > m then l = m+1
        when m at 1st index and key < m then h = m-1
        when key no found in mid ex: {1,3,5,6} key=4 ; h=1 and l=2 at termination condition
        for all case we return l for insert position*/

        int[] nums = {1,3,5,6};
        int target = 5;

        System.out.println(searchInsert(nums, target));

        target = 2;
        System.out.println(searchInsert(nums, target));

        target = 7;
        System.out.println(searchInsert(nums, target));

        target = 0;
        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target) {
        int l=0, h = nums.length-1;

        while(l<=h){
            int m = (l+h)/2;
            if (nums[m] == target){
                return m;
            } else if (nums[m] < target) {
                l = m+1;
            }else {
                h = m-1;
            }
        }
        return l;
    }
}
