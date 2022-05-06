import java.util.Scanner;

public class Matrix {
    int row, column;
    float mat[][];
    int i, j, k;

    Scanner input = new Scanner(System.in);

    Matrix(float a[][]) {
        this.mat = a;
    }

    Matrix() {
        System.out.print("Enter the number of rows: ");
        row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        column = input.nextInt();
        mat = new float[row][column];
        System.out.println("Enter elements in " + row + " x " + column + " matrix one by one: ");
        // for (i = 0; i < row; i++) {
        // for (j = 0; j < column; j++) {
        // mat[i][j] = input.nextFloat();
        // }
        // }
        readMatrix();
    }

    Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        mat = new float[row][column];
    }

    void readMatrix() {
        System.out.println("Enter elements in " + row + "x" + column + " matrix one by one:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                mat[i][j] = input.nextFloat();
            }
        }
    }

    void transpose() {
        float b[][] = new float[mat.length][mat.length];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                b[i][j] = mat[j][i];
            }
        }
        System.out.println(" Transpose of Matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(b[i][j] + "  ");
            }
            System.out.println();
        }
    }

    void matrixMultiplication() {
        float c[][] = new float[mat.length][mat.length];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                c[i][j] = 0;
                for (k = 0; k < mat.length; k++) {
                    c[i][j] += mat[i][k] * mat[k][j];
                }
            }
        }
        System.out.println(" Multiplication of Matrix is :");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
    }

    void displayMatrix(float a[][]) {
        System.out.println("Matrix:");
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    void displayMatrix() {
        System.out.println("Matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    float Maximum() {
        float max;
        max = mat[0][0];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (max < mat[i][j])
                    max = mat[i][j];
            }
        }
        return max;
    }

    float average() {
        float sum = 0, avg;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                sum += mat[i][j];
            }
        }
        avg = sum / (row * column);
        return avg;
    }

    public static void main(String[] args) {
        float m;
        float a1[][] = { { 1, 2 }, { 2, 3 } };
        Matrix m1 = new Matrix(a1);
        Matrix m2 = new Matrix();
        Matrix m3 = new Matrix(3, 3);
        m1.displayMatrix(a1);
        m2.displayMatrix();
        m3.readMatrix();
        m3.displayMatrix();
        m2.transpose();
        m2.matrixMultiplication();
        m = m2.Maximum();
        System.out.println("Maximum no. is " + m);
        m = m2.average();
        System.out.println("Average is " + m);
    }
}