public class Prog13_MatrixMultiplication {
    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int rows_a = a.length;
        int cols_a = a[0].length;
        int cols_b = b[0].length;
        
        int[][] result = new int[rows_a][cols_b];
        
        for (int i = 0; i < rows_a; i++) {
            for (int j = 0; j < cols_b; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols_a; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        return result;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};
        
        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("\nMatrix B:");
        printMatrix(matrixB);
        
        int[][] result = multiplyMatrix(matrixA, matrixB);
        System.out.println("\nMatrix A * B:");
        printMatrix(result);
    }
}
