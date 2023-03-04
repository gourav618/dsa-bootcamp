package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NumberOfPaths {
    public static void main(String[] args){
       //https://practice.geeksforgeeks.org/problems/number-of-paths0926/1

        int m =3, n=3;
        System.out.println(numberOfPaths(m, n));
        System.out.println(numberOfPaths(5, 1));
    }

    static long paths = 0;
    private static long numberOfPaths(int m, int n) {
        paths = 0;
        getNumberOfPath(0, 0, m, n);
        return paths;
    }

    private static void getNumberOfPath(int i, int j, int m, int n) {
        if (i == m-1 && j == n-1){
            paths++;
            return;
        }
        if (i == m-1){
            getNumberOfPath(i, j+1, m, n);
        } else if (j == n-1) {
            getNumberOfPath(i+1, j, m, n);
        }else {
            getNumberOfPath(i+1, j, m, n);
            getNumberOfPath(i, j+1, m, n);
        }
    }
}
