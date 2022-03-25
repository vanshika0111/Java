import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        int a;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = S.nextInt();
        for (int i = 1; i < 11; ++i) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }

}
