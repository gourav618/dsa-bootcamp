import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args){
        //https://leetcode.com/problems/set-matrix-zeroes/

        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        setZeroes(matrix);

        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
              System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int[][] matrix1 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        setZeroes(matrix1);

        for (int i=0; i< matrix1.length; i++){
            for (int j=0; j<matrix1[0].length; j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        //precompute the ith row and jth column with value 0
        int[] row_map = new int[m];
        Arrays.fill(row_map, 1);
        int[] col_map = new int[n];
        Arrays.fill(col_map, 1);
        for (int i=0; i<m; i++){
            for (int j=0;j<n; j++){
                if (matrix[i][j] == 0) {
                    row_map[i] = 0;
                    col_map[j] = 0;
                }
            }
        }

        //now traverse on matrix and change the value of the entire row and column to 0
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (row_map[i] == 0 || col_map[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
