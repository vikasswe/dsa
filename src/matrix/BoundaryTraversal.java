package matrix;

public class BoundaryTraversal {


    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {4, 5, 6, 5},
                {7, 8, 9, 6},
                {11, 12, 13, 14}
        };

        int m = 4;
        int n = 4;

        // Left to right (print column)
        for (int j = 0; j < m; j++) {
            System.out.print(arr[0][j] + " ");
        }

        System.out.println();

        // Top to bottom(print rows)
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i][m - 1] + " ");
        }

        System.out.println();

        // right to left (Print column)
        if (n > 1) {
            for (int j = m - 2; j >= 0; j--) {
                System.out.print(arr[n - 1][j] + " ");
            }
        }

        System.out.println();

        // Bottom to top (print rows)
        if (m > 1) {
            for (int i = n - 2; i > 0; i--) {
                System.out.print(arr[i][0]);
            }
        }
    }

}
