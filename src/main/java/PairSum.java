import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static void main(String[] args){
        //https://practice.geeksforgeeks.org/problems/key-pair5616/1

        int[] arr = {1,4,45,6,10,8};
        int x = 16, n=6;
        System.out.println(hasArrayTwoCandidates(arr, n, x));

        int[] arr1 = {1, 2, 4, 3, 6};
        System.out.println(hasArrayTwoCandidates(arr1, 5, 10));

        int[] arr2 = {162,637,356,768,656,575,32,53,351,151,942,725,967,431,108,192,8,338,458,288,754,384,946,910,210,759,222,589,423,947,507,31,414,169,901,592,763,656,411,360,625,538,549,484,596,42,603,351,292,837,375,21,597,22,349,200,669,485,282,735,54,1000,419,939,901,789,128,468,729,894,649,484,808,422,311,618,814,515,310,617,936,452,601,250,520,557,799,304,225,9,845,610,990,703,196,486,94,344,524,588,315,504,449,201,459,619,581,797,799,282,590,799,10,158,473,623,539,293,39,180,191,658,959,192,816,889,157,512,203,635,273,56,329,647,363,887,876,434,870,143,845,417,882,999,323,652,22,700,558,477,893,390,76,713,601,511,4,870,862,689,402,790,256,424,3,586,183,286,89,427,618,758,833,933,170,155,722,190,977,330,369,693,426,556,435,550,442};
        System.out.println(hasArrayTwoCandidates(arr2, 187, 1291));

        int[] arr3 = {1,2,2,6,7};
        System.out.println(hasArrayTwoCandidates(arr3, 5, 4));
    }

    private static boolean hasArrayTwoCandidates(int[] arr, int n, int x) {
        //add all key in HashMap with frequency
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        boolean isPresent = false;
        for (int i=0; i<n; i++){
            int remSum = x - arr[i];
            if (remSum == arr[i]){
                isPresent = map.containsKey(remSum) && map.get(remSum) > 1;
            }else {
                isPresent = map.containsKey(remSum);
            }
            if (isPresent) break;
        }
        return isPresent;
    }
}
