import java.lang.*;
import java.util.Scanner;

public class Ass2Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
		
		System.out.println("Enter values for matrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
		
		System.out.println("Enter values for matrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
		
		int[][] matrix3 = new int[3][3];
		System.out.println("The Addition of the matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
		
		System.out.println("Transpose of matrix 3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix3[j][i] + " ");
            }
            System.out.println();
        }
    }
}
		
