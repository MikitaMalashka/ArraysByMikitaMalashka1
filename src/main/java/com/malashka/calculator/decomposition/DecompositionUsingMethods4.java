package main.java.com.malashka.calculator.decomposition;

import java.lang.Math;

public class DecompositionUsingMethods4 {
    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2, 4, 7, 8}, {2, 2, 2, 2, 2}};
        System.out.println("Максимальное расстояние между точками: " + findMaxDistance(matrix1));
    }

    public static double findMaxDistance(double[][] matrix) {
        double max = 0;
        double leng = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                leng = Math.sqrt((Math.pow(matrix[0][i] - matrix[0][j], 2)) +
                        (Math.pow(matrix[1][i] - matrix[1][j], 2)));
                if (leng > max) {
                    max = leng;
                }
            }
        }
        return max;
    }
}
