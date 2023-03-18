import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static void main(String[] args){
        //https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

         System.out.println(lenOfLongSubarr(new int[]{10,5,2,7,1,9}, 6, 15));
    }

    private static int lenOfLongSubarr(int[] A, int N, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int ps = 0, ans = 0;
        for (int i=0; i<N; i++){
            ps += A[i];

            if (map.containsKey(ps-K)){
                ans = Math.max(ans, i - map.get(ps-K));
            }

            if (!map.containsKey(ps)){
                map.put(ps, i);
            }
        }
        return ans;
    }
}
