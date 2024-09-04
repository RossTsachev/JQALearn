package Homework2;

import java.util.Scanner;

public class Task03 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Task03 task3 = new Task03();
        double[] numbers = new double[5];

        for (int i=0; i < 5; i++) {
            numbers[i] = task3.getDoubleFromConsole(scanner, i);
        }

        System.out.println("The elements of the created array are:");
        for (double number:numbers) {
            System.out.print(number + " ");
        }
    }

    private double getDoubleFromConsole(Scanner scanner, int index) {
        boolean correctInput = false;
        double result = 0;
        do {
            System.out.print("Please enter a valid double number for array element with index ["
                    + index + "] (and press Enter): ");
            if (scanner.hasNextDouble()) {
                result = scanner.nextDouble();
                correctInput = true;
            } else {
                scanner.nextLine(); //used to consume the \n symbol and prevent endless loop
                System.out.println("Incorrect double value!");
            }
        } while (!correctInput);

        return result;
    }
}
