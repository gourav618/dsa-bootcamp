package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args){
        //https://leetcode.com/problems/combination-sum-iii/

        int k = 3, n = 7;
        System.out.println(combinationSum3(k, n));
        System.out.println(combinationSum3(3, 9));
        System.out.println(combinationSum3(4, 1));
    }

    private static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> comb = new ArrayList<>();
        getCombinationSum(k, n, 1, n, comb, new ArrayList<>());
        return comb;
    }

    private static void getCombinationSum(int k, int n, int i,int remSum, List<List<Integer>> comb, List<Integer> temp) {
        if (temp.size() == k){
            if (remSum == 0){
                comb.add(new ArrayList<>(temp));
            }
            return;
        }

        for (int t=i; t<=9; t++){
            temp.add(t);
            getCombinationSum(k, n, t+1,remSum-t, comb, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
