
import java.util.Scanner;

class Q9{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int [3][4];
        System.out.println("Please enter the 3 X 4 Matrix : ");
        for(int i =0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
             
        System.out.println("The given Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t", arr[i][j]);   
            }
            System.out.println();  
        }

         System.out.println("\nRow-wise sum:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;   
            for (int j = 0; j < 4; j++) {
                rowSum += arr[i][j];  
            }
            System.out.println("Sum of row " + (i+1) + ": " + rowSum);
        }

  
        System.out.println("\nColumn-wise sum:");
        for (int j = 0; j < 4; j++) {
            int colSum = 0;   
            for (int i = 0; i < 3; i++) {
                colSum += arr[i][j];  
            }
            System.out.println("Sum of column " + (j+1) + ": " + colSum);
        }
    }
}

