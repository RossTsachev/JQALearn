package Homework1;

public class Task07 {
    public static void main( String[] args ) {

        System.out.println("Printing numbers from 1 to 100 (without 54 to 74):");

        for (int i=1; i <= 100; i++) {
            if ((i >= 54) && (i <= 74)) {
                continue;
            }
            System.out.println(i);
        }
    }
}
