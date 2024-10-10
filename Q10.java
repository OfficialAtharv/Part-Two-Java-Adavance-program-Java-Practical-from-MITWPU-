
import java.util.Scanner;

class Q10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the numer of rows of 1st matrix :");
        int row_one = sc.nextInt();
        System.out.println("Please Enter the numer of column of 1st matrix :");
        int col_one = sc.nextInt();
        int array_one[][] = new int[row_one][col_one];
        System.out.println("Enter the elements of first matrix ");
        for (int i = 0; i < row_one; i++) {
            for (int j = 0; j < col_one; j++) {
                array_one[i][j] = sc.nextInt();
            }
        }

        System.out.println("Please Enter the numer of rows of 2nd matrix :");
        int row__two = sc.nextInt();
        System.out.println("Please Enter the numer of column of 2nd matrix :");
        int col_two = sc.nextInt();
        int array_two[][] = new int[row__two][col_two];
        System.out.println("Enter the elements of Second matrix ");
        for (int i = 0; i < row_one; i++) {
            for (int j = 0; j < col_one; j++) {
                array_two[i][j] = sc.nextInt();
            }
        }

        int result[][] = new int[row_one][col_two];
        for (int i = 0; i < row_one; i++) {
            for (int j = 0; j < col_two; j++) {
                for (int k = 0; k < col_one; k++) {
                    result[i][j] += array_one[i][k] * array_two[k][j];
                }
            }
        }

        System.out.println("The product of the matrices is:");
        for (int i = 0; i < row_one; i++) {
            for (int j = 0; j < col_two; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
