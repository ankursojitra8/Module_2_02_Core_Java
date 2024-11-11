// 4. Write a java program to make addition, Subtraction and multiplication of two matrix using 2-D Array.

package One_Array;

import java.util.Scanner;

public class Four_Matrix_Addition_Subtraction_Multiplication 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

        System.out.print("-> Enter Matrix Size (Rows Columns) : ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] matrixA=new int[rows][cols];
        int[][] matrixB=new int[rows][cols];
        System.out.println("-> Enter Elements Of first Matrix :");
        inputMatrix(sc, matrixA);
        System.out.println("-> Enter Elements Of Second Matrix :");
        inputMatrix(sc, matrixB);

        System.out.println("-->> Matrix Addition :");
        displayMatrix(addMatrices(matrixA, matrixB));
        System.out.println("-->> Matrix Subtraction :");
        displayMatrix(subtractMatrices(matrixA, matrixB));
        System.out.println("-->> Matrix Multiplication :");
        displayMatrix(multiplyMatrices(matrixA, matrixB, rows, cols));
    }

    private static void inputMatrix(Scanner sc, int[][] matrix)
    {
        for (int i = 0; i<matrix.length; i++)
            for (int j = 0; j<matrix[0].length; j++)
                matrix[i][j]=sc.nextInt();
    }

    private static int[][] addMatrices(int[][] A, int[][] B) 		// Addition of Both matrices
    {
        int[][] result=new int[A.length][A[0].length];
        for (int i=0; i<A.length; i++)
            for (int j=0; j<A[0].length; j++)
                result[i][j]=A[i][j]+B[i][j];
        return result;
    }

    private static int[][] subtractMatrices(int[][] A, int[][] B) 	// Subtraction of Both matrices
    {
        int[][] result=new int[A.length][A[0].length];
        for (int i=0; i<A.length; i++)
            for (int j=0; j<A[0].length; j++)
                result[i][j]=A[i][j]-B[i][j];
        return result;
    }

    private static int[][] multiplyMatrices(int[][] A, int[][] B, int rows, int cols) 	    // Multiplication of Both matrices
    {
        int[][] result=new int[rows][cols];
        for (int i=0; i<rows; i++)
            for (int j=0; j<cols; j++)
                for (int k=0; k<cols; k++)
                    result[i][j]+=A[i][k]*B[k][j];
        return result;
    }

    private static void displayMatrix(int[][] matrix) 
    {
        for (int[] row:matrix) 
        {
            for (int elem:row)
                System.out.print(elem + " ");
            System.out.println();
        }
	}
}
