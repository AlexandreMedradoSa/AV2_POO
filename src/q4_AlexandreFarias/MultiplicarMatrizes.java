package q4_AlexandreFarias;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiplicarMatrizes {

    public static void main(String[] args) {
        try {
            int[][] matrizA = readMatrixFromFile("matrizA.txt");
            int[][] matrizB = readMatrixFromFile("matrizB.txt");

            int[][] resultMatrix = multiplyMatrices(matrizA, matrizB);
            printMatrix(resultMatrix);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[][] readMatrixFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(line -> line.split(" "))
                    .map(arr -> java.util.Arrays.stream(arr).mapToInt(Integer::parseInt).toArray())
                    .toArray(int[][]::new);
        }
    }

    public static int[][] multiplyMatrices(int[][] matrizA, int[][] matrizB) {
        int numRowsA = matrizA.length;
        int numColsA = matrizA[0].length;
        int numColsB = matrizB[0].length;
        int[][] resultMatrix = new int[numRowsA][numColsB];

        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsB; j++) {
                int sum = 0;
                for (int k = 0; k < numColsA; k++) {
                    sum += matrizA[i][k] * matrizB[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }

        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
