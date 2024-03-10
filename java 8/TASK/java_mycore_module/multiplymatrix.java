package java_mycore_module;

import java.util.Scanner;

public class multiplymatrix {

    public static void main(String[] args) {
        System.out.println("Enter the row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        System.out.println("Enter the column");
        int col = sc.nextInt();

        int k,i,j;
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int c[][] = new int[row][col];

        System.out.println("Enter the " + (row * col) + "value for the first matrix");

        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the " + (row * col) + "value for the second matrix for multiplication");

        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("your first matrix is :");

        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("your second matrix is :");

        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++){
                // for variable b matrix printing below line so when copy then focus what to change or check your copy code not having error

                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("your multiplication matrix is ");

        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++){

                for(k=0; k<row; k++){
                    c[i][j] = c[i][j]+a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+ "\t");
                c[i][j] = 0;

            }
            System.out.println();
        }

    }
}
