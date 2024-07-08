package DSAquestions;

import java.util.ArrayList;
import java.util.List;

public class DeterminanatOfMatrix {
    public static int Base(int[][] matrix){
        int determinant = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[2][1] * matrix[1][2]);
        determinant -= matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[2][0] * matrix[1][2]);
        determinant += matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[2][0] * matrix[1][1]);
        System.out.println("Determinant of 3x3 matrix: " + determinant);
        return determinant;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {-2, 7, 0, 6, -2},
                {1, -1, 3, 2, 2},
                {3, 4, 0, 5, 3},
                {2, 5, -4, -2, 2},
                {0, 3, -1, 1, -4}
        };

        int ans = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                System.out.println(matrix[0][i] + "----------");
                ans += matrix[0][i] * makeMatrix(i, matrix);
            } else {
                ans -= matrix[0][i] * makeMatrix(i, matrix);
            }
        }

        System.out.println("Determinant of 5x5 matrix: " + ans);
    }

    private static int makeMatrix(int curr, int[][] matrix) {
        int[][] demoMat = new int[4][4];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == curr)
                    continue;
                else
                    list.add(matrix[i][j]);
            }
        }
        System.out.println("List of elements for submatrix: " + list);
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                demoMat[i][j] = list.get(k++);
            }
        }

        return Base4x4(demoMat);
    }

    private static int Base4x4(int[][] matrix) {
        int determinant = 0;
        for (int i = 0; i < 4; i++) {
            int[][] subMatrix = new int[3][3];
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (k == i)
                        continue;
                    list.add(matrix[j][k]);
                }
            }
            int l = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    subMatrix[j][k] = list.get(l++);
                }
            }
            if (i % 2 == 0) {
                determinant += matrix[0][i] * Base(subMatrix);
            } else {
                determinant -= matrix[0][i] * Base(subMatrix);
            }
        }
        System.out.println("Determinant of 4x4 matrix: " + determinant);
        return determinant;
    }
}
