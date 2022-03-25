import java.util.Scanner;

class Array {
    int data[];

    // create array data of size 10
    public Array() {
        data = new int[10];
        // data = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    }

    // create array of size size
    public Array(int size) {
        data = new int[size];
    }

    // initialize array with parameter array
    // Array(int data[]) {

    // }

    // void ReverseArray() {

    // }

    // int MaximumArray() {

    // }

    // int AverageArray() {

    // }

    // void Sorting() {

    // }

    // void Display() {

    // }

    // int Search(int number) {

    // }

    // int size() {

    // }
}

public class ArrayManipulation {
    public static void main(String args[]) {
        Array ob1 = new Array();
        Array ob2 = new Array(3);
        System.out.println("Array elements");
        for (int i : ob1.data) {
            System.out.println(i);
        }
    }
}