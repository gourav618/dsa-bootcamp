import java.util.HashMap;

public class SubarrayWithZeroSum {
    public static void main(String[] args){
        //https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

        int n = 5;
        int[] arr = {4,2,-3,1,6};

        System.out.println(finsum(arr, n));
        System.out.println(finsum(new int[]{4,2,0,1,6}, 5));
        System.out.println(finsum(new int[]{1,2,3,-6}, 4));
    }

    private static boolean finsum(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //if entire array sum is zero, lets consider empty prefix sum
        map.put(0, 1);

        boolean isSubArrayWithSum0 = false;
        int ps = 0;
        for (int i=0; i<n; i++){
            ps += arr[i];
            if (map.containsKey(ps)){
                isSubArrayWithSum0 = true;
                break;
            }else {
                map.put(ps, 1);
            }
        }
        return isSubArrayWithSum0;
    }
}
