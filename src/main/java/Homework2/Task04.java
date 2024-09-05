package Homework2;

import java.util.Scanner;

public class Task04 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Task04 task4 = new Task04();
        int[] numbers = new int[10];

        for (int i=0; i < 10; i++) {
            numbers[i] = task4.getIntFromConsole(scanner, i);
        }

        System.out.println("The elements of the created array displayed with for loop :");
        for (int number:numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("The elements of the created array displayed with while loop :");
        int iterator = 0;
        while(iterator < numbers.length) {
            System.out.print(numbers[iterator] + " ");
            iterator++;
        }
    }

    private int getIntFromConsole(Scanner scanner, int index) {
        boolean correctInput = false;
        int result = 0;
        do {
            System.out.print("Please enter a valid integer number for array element with index ["
                    + index + "] (and press Enter): ");
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                correctInput = true;
            } else {
                scanner.nextLine(); //used to consume the \n symbol and prevent endless loop
                System.out.println("Incorrect integer value!");
            }
        } while (!correctInput);

        return result;
    }
}
