// program to check if a program is prime or not

import java.util.Scanner;

public class Prime {
    public static void main(String srgs[]) {
        int number;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = S.nextInt();
        boolean IsPrime = true;
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                IsPrime = false;
                break;
            }
        }
        if (IsPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        S.close();
    }
}
