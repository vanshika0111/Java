// program to check if a number is odd or even

import java.util.Scanner;

public class OddEven {
    public static void main(String args[]) {
        int a;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = S.nextInt();
        if (a % 2 != 0) {
            System.out.println(a + " is an odd number.");
        } else {
            System.out.println(a + " is an even number.");
        }
        S.close();
    }

}
