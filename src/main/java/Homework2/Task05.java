package Homework2;

public class Task05 {
    public static void main( String[] args ) {
        int[] firstArray = {10, 12, 1, 8, 4};

        System.out.println("Elements in first array:");
        for (int i:firstArray) {
            System.out.print(i + " ");
        }

        int [] secondArray = firstArray.clone();

        System.out.println();
        System.out.println("Elements in second array:");
        for (int i:secondArray) {
            System.out.print(i + " ");
        }
    }
}
