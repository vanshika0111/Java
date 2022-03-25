import java.util.Scanner;

class M {
    void read(int[][] a, int[][] b) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        // int a[][] = new int[3][3];
        System.out.println("Enter First Matrix :");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix :");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void display(int[][] a, int[][] b) {
        System.out.println("First Matrix is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    void Transpose(int[][] a, int[][] b) {
        System.out.println("Transpose of First Matrix :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = a[j][i];
            }
        }
        // System.out.println("Transpose Matrix is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    void Multiplication(int[][] a, int[][] b) {
        int c[][] = new int[3][3];
        System.out.println("Multiplication of matrix is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.printf(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    void Average(int[][] a) {
        int i, j, sum = 0;
        double ave;
        System.out.println("Average of Maxtrix :");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sum += a[i][j];
            }
        }
        ave = sum / (3 * 3);
        System.out.println(ave);
    }

    void Maximum(int[][] a) {
        int max = a[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Maxtimum element is : " + max);
    }

    void Minimum(int[][] a) {
        int min = a[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("Minumum element is :" + min);
    }
}

public class Matrix {
    public static void main(String args[]) {
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        // int C[][] = new int[3][3];
        M m = new M();
        m.read(A, B);
        m.display(A, B);
        m.Average(A);
        m.Maximum(A);
        m.Minimum(A);
        m.Multiplication(A, B);
        m.Transpose(A, B);
    }
}
