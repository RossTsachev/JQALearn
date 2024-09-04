package Homework2;

import java.util.Scanner;

public class Task01 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Task01 task1 = new Task01();

        int numberOne;
        int numberTwo;
        numberOne = task1.getIntegerFromConsole(scanner, 1);
        numberTwo = task1.getIntegerFromConsole(scanner, 2);

        System.out.println("The sum of the two numbers is: " + (numberOne + numberTwo));
    }

    private int getIntegerFromConsole(Scanner scanner, int index) {
        boolean correctInput = false;
        int result = 0;
        do {
            System.out.print("Please enter a valid integer number " + index + " (and press Enter): ");
            if (scanner.hasNextInt()){
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
