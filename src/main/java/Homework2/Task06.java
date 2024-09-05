package Homework2;

import java.util.Arrays;

public class Task06 {
    public static void main( String[] args ) {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};

        System.out.println("Elements in first array:");
        for (int i:firstArray) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println("Elements in second array:");
        for (int i:secondArray) {
            System.out.printf("%d ", i);
        }

        System.out.println();
        if (Arrays.equals(firstArray, secondArray)) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }
    }
}
