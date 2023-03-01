package Searching;

public class SquareRoot {
    public static void main(String[] args){
        //https://leetcode.com/problems/sqrtx/

        System.out.println(mySqrt(2147395599));
    }

    private static int mySqrt(int x) {
        long l=0, h=x/2;
        while (l<=h){
            long m = l + (h-l)/2;

            if (m*m > x){
                h = m-1;
            }else {
                if ((m+1)*(m+1) > x){
                    return (int) m;
                }else {
                    l = m+1;
                }
            }
        }
        return (int) l;
    }
}
