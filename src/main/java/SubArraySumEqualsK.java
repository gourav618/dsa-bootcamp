import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args){
        //https://leetcode.com/problems/subarray-sum-equals-k/

        System.out.println(subArraySum(new int[]{1,1,1}, 2));
        System.out.println(subArraySum(new int[]{1,2,3}, 3));
        System.out.println(subArraySum(new int[]{10,5,2,7,1,9}, 15));
        System.out.println(subArraySum(new int[]{1,-1,0}, 0));
    }

    private static int subArraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int ps=0, count=0;
        for (int i=0; i< nums.length; i++){
            ps += nums[i];

            if (map.containsKey(ps-k)){
                count += map.get(ps-k);
            }
            map.put(ps, map.getOrDefault(ps, 0)+1);
        }
        return count;
    }
}
