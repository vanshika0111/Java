import java.util.Scanner;

class Calculations {
    int result;

    void Menu() {
        System.out.println("---------------------------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    void Addition(int x, int y) {
        result = x + y;
        System.out.println("Addition = " + result);
    }

    void Subtraction(int x, int y) {
        // result = x - y;
        System.out.println("Subtraction = " + (x - y));
    }

    void Multiplication(int x, int y) {
        result = x * y;
        System.out.println("Multiplication = " + result);
    }

    void Division(int x, int y) {
        result = x / y;
        System.out.println("Division = " + result);
    }
}

public class Calculator {
    public static void main(String args[]) {
        Calculations object = new Calculations();
        Scanner S = new Scanner(System.in);
        int choice;
        int a, b;

        do {
            object.Menu();
            System.out.print("Enter your choice: ");
            choice = S.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.println("Enter first number: ");
                    a = S.nextInt();
                    System.out.println("Enter second number: ");
                    b = S.nextInt();
                    object.Addition(a, b);
                    break;
                case '2':
                    System.out.println("Enter first number: ");
                    a = S.nextInt();
                    System.out.println("Enter second number: ");
                    b = S.nextInt();
                    object.Subtraction(a, b);
                    break;
                case '3':
                    System.out.println("Enter first number: ");
                    a = S.nextInt();
                    System.out.println("Enter second number: ");
                    b = S.nextInt();
                    object.Multiplication(a, b);
                    break;
                case '4':
                    System.out.println("Enter first number: ");
                    a = S.nextInt();
                    System.out.println("Enter second number: ");
                    b = S.nextInt();
                    object.Division(a, b);
                    break;
                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        } while (choice != 5);
        S.close();
    }
}
