package java_mycore_module;

import java.util.Scanner;

public class inversematrix {
    public static void main(String[] args) {
        System.out.println("Enter the column matrix");
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();

        System.out.println("Enter the row matrix");
//        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        int a[][] = new int[row][col];
//        int b[][] = new int[col][row];

        System.out.println("Enter the "+(row*col)+"VALUE");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your original matrix");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
//                a[i][j] = sc.nextInt();
                // it is only print not println below line
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        // above commented line is mistake virtually because it takes input instead of printing
        // want to change inverse thats why below code first comes col , and after row and similarly first j and after i
        // \t this is correct , use for tab
        // when print a[row][col] is wrong right is a[i][j]; <- is right
        // in condition of for loop is not i<=col and same for row
        System.out.println("Your inverse matrix is :");

        for (int i = 0; i < col; i++) {

            for (int j = 0; j < row; j++) {
//                a[i][j] = sc.nextInt();
                System.out.print(a[j][i] + "\t");
            }
            System.out.println();
        }


    }
}
