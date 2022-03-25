import java.util.Scanner;

public class Array {
    static void array(int a[]) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 10 elements of array :");
        for (i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void display(int a[]) {
        int i;
        System.out.println("your array elements is :");
        for (i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

    }

    static void reverse(int a[]) {
        System.out.println("reverse array is :");
        for (int i = 9; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

    static void search(int a[]) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter element which is you want to search :");
        n = sc.nextInt();
        for (i = 0; i < 10; i++) {
            if (n == a[i])
                ;
            {
                System.out.println("element is:" + a[i] + " place " + i);
            }
        }
    }

    static void min(int a[]) {
        int min = a[0];
        for (int i = 0; i < 10; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("min is :" + min);
    }

    static void max(int a[]) {
        int max = a[0];
        for (int i = 0; i < 10; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("max is :" + max);
    }

    static void size(int a[]) {
        int size = a.length;
        System.out.println("size of array :" + size);
    }

    static void ave(int a[]) {
        int i;
        double ave = 0, sum = 0;
        for (i = 0; i < 10; i++) {
            sum = sum + a[i];
        }
        ave = sum / 10;
        System.out.println("average is:" + ave);
    }

    static void sort(int a[]) {
        int i, j, temp;
        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("sorted array is : ");
        for (i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        array(arr);
        display(arr);
        reverse(arr);
        search(arr);
        min(arr);
        max(arr);
        size(arr);
        ave(arr);
        sort(arr);
    }
}
