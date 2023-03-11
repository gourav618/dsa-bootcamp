package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Combinations {
    public static void main(String[] args){
        //https://leetcode.com/problems/combinations/
        int n=4, k=2;
        System.out.println(combine(n, k));
    }

    private static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> comb = new ArrayList<>();

        getCombination(comb, 1, k, n, new ArrayList<>());
        return comb;
    }

    private static void getCombination(List<List<Integer>> comb, int i, int k, int n, List<Integer> temp) {
        if (temp.size() == k){
            comb.add(new ArrayList<>(temp));
            return;
        }

        for (int t=i; t<=n; t++){
            temp.add(t);
            getCombination(comb, t+1, k, n, temp);
            temp.remove(temp.size()-1);
        }

    }
}
