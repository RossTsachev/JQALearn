package Homework2;

import java.util.Scanner;

public class Task02 {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Task02 task2 = new Task02();

        int numberOne;
        int numberTwo;
        double average;
        numberOne = task2.getIntegerFromConsole(scanner, 1);
        numberTwo = task2.getIntegerFromConsole(scanner, 2);
        average = (double) (numberOne + numberTwo)/2;

        System.out.println("The average of the two numbers is: " + average);
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
