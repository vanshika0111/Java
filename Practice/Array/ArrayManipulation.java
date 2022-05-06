import java.util.Scanner;

class ArrayManipulation {
    int data[];
    int N = 6;

    Scanner s = new Scanner(System.in);

    // create array data of size 10
    ArrayManipulation() {
        data = new int[10];
        System.out.print("Enter 6 elements of array: ");
        for (int i = 0; i < N; i++) {
            data[i] = s.nextInt();
        }
    }

    // create array of size size
    ArrayManipulation(int size) {
        data = new int[size];
        System.out.print("Enter " + size + " elements of array: ");
        for (int i = 0; i < size; i++) {
            data[i] = s.nextInt();
        }
    }

    // initialize array with parameter array
    ArrayManipulation(int data[]) {
        this.data = data;
    }

    void ReverseArray() {
        System.out.print("Reversed array: ");
        System.out.print("[ ");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println(" ]");
    }

    int MaximumArray() {
        int max;
        max = data[0];
        System.out.print("Maximum element: ");
        for (int i = 0; i < N; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }

    int AverageArray() {
        int avg, sum = 0;
        System.out.print("Average of array: ");
        for (int i = 0; i < N; i++) {
            sum += data[i];
        }
        avg = sum / N;
        return avg;
    }

    void Sorting() {
        int k;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (data[j] < data[i]) {
                    k = data[j];
                    data[j] = data[i];
                    data[i] = k;
                }
            }
        }
        System.out.print("Sorted array: [ ");
        for (int i = 0; i < N; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(" ]");
    }

    void Display() {
        System.out.print("Array: [ ");
        for (int i = 0; i < N; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(" ]");
    }

    int Search(int number) {
        for (int i = 0; i < N; i++) {
            if (data[i] == number) {
                System.out.println("Number found at " + i + 1);
            }
        }
        return 0;
    }

    // int size() {

    // }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b;
        ArrayManipulation x = new ArrayManipulation();
        ArrayManipulation y = new ArrayManipulation(5);
        ArrayManipulation z = new ArrayManipulation(a);
        x.Display();
        y.Display();
        z.Display();
        x.ReverseArray();
        b = x.MaximumArray();
        b = x.AverageArray();
        b = x.Search(3);
        x.Sorting();
    }
}
