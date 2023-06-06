package chapter18;

import java.util.*;


public class ArraysDemo {
    public static void main(String[] args) {


        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;


        System.out.print("Array ");
        display(array);
        Arrays.sort(array);
        System.out.println("Sorted array: ");
        display(array);
        Arrays.fill(array,2,6,-1);
        System.out.println("Filled ");
        display(array);
        Arrays.sort(array);
        System.out.println("Sorted again ");
        display(array);

        System.out.print("-9 at ");
        int index = Arrays.binarySearch(array,-9);
        System.out.println(index);

    }

    static void display(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
            System.out.println();
        }

    }
}
