public class Sum {
    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int sum = 0, avg = 0;
        for (int i = 0; i < 10; i++)
            sum = sum + array[i];
        avg = sum / 10;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}