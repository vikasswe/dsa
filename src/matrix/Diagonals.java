package matrix;


public class Diagonals {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Primary diagonals
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }

        System.out.println();


        // Secondary Diagonals
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][n - i - 1] + " ");
        }

        //Full diagonals
        /*
        * Sum of indexes i+j
        * find minimum sum and maximum sum (0,0->0 and 2,2->4) means constant will be (0->4)
        * find the constant (0,1,2,3,4) These constants will define each diagonal.
        * Group = all elements where i+j = same constant
        *
        * Constant = 0 → sum = 0
        * Find all (i,j) where i+j=0
        * Only (0,0) → 1 means Group 0: 1
        *
        * Constant = 1 → sum = 1
        * Find all (i,j) where i+j=1
        * (0,1) = 2, (1,0) = 4
        * Group 1: 2 4
        *
| Element | i | j | i+j (sum) |
| ------- | - | - | --------- |
| 1       | 0 | 0 | 0         |
| 2       | 0 | 1 | 1         |
| 3       | 0 | 2 | 2         |
| 4       | 1 | 0 | 1         |
| 5       | 1 | 1 | 2         |
| 6       | 1 | 2 | 3         |
| 7       | 2 | 0 | 2         |
| 8       | 2 | 1 | 3         |
| 9       | 2 | 2 | 4         |
        *
        * */
        int x = 3;
        int y = 3;
        System.out.println();
        for (int constant = 0; constant <= x + y - 2; constant++) {
            for (int i = 0; i < x; i++) {
                // Column is
                int j = constant - i;
                System.out.println("J=>" + j);
                if (j >= 0 && j < y) {
                    System.out.println();
                    System.out.print("Answer is => " + arr[i][j] + " ");
                }

            }
            System.out.println();
            System.out.println("<=================next iteration===========>");
        }

    }

}
