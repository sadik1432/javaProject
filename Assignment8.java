// Matrix Multiplication

import java.util.*;

class Matrix {
    int row, col, i, j;
    float array[][];

    Matrix(int r, int c, float arr[][]) {
        row = r;
        col = c;
        array = arr;
    }

    void display() {
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiply(Matrix m) {
        if (col != m.row) {
            System.out.println("matrix multiplication impossible");
            System.exit(0);
        }
        float a[][]=new float[row][m.col];
        System.out.println("Result: ");
        for (i = 0; i < row; i++) {
            for(int j = 0; j<m.col;j++){
                a[i][j]=0;
                for(int k=0;k<col;k++){
                    a[i][j]+=array[i][k]*m.array[k][j];
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class Assignment8{
    static int r,c;
    static float a[][];
    public static void main(String[] args) {
        System.out.println("enter the order of first matrix");
        input();
        Matrix m1=new Matrix(r,c,a);
        System.out.println("the first matrix is: ");
        m1.display();
        System.out.println("enter the order of second matrix");
        input();
        Matrix m2=new Matrix(r,c,a);
        System.out.println("the first matrix is: ");
        m2.display();
        m1.multiply(m2);
    }
    static void input(){
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        a=new float[r][c];
        System.out.println("Enter the element: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextFloat();
            }
        }
    }
}