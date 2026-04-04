package matrix;

public class PrintMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 2, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        PrintMatrix printMatrix = new PrintMatrix();
        boolean right = printMatrix.isItSquare(matrix);
        System.out.println("Perfect Square :- " + right);

        if (right) {
            printMatrix.middleElement(matrix);
        }
    }

    void middleElement(int[][] matrix) {
        int n = matrix.length;

        if (n % 2 == 0) {
            System.out.println("No single middle element (even size matrix)");
            return;
        }

        int middleIndex = n / 2;
        System.out.println("Middle element: " + matrix[middleIndex][middleIndex]);
    }

    boolean isItSquare(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            if (matrix[i].length != n) {
                return false;
            }
        }
        return true;
    }

}
