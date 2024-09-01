package Homework1;

import java.util.Scanner;

public class Task03 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Task03 task3 = new Task03();
        int numberOne;
        int numberTwo;
        int numberThree;
        int tempHolder;

        numberOne = task3.getIntegerFromConsole(scanner);
        numberTwo = task3.getIntegerFromConsole(scanner);
        numberThree = task3.getIntegerFromConsole(scanner);

        System.out.println("Initially entered values: " + numberOne + " " + numberTwo + " " + numberThree);

        tempHolder = numberOne;
        numberOne = numberTwo;
        numberTwo = numberThree;
        numberThree = tempHolder;
        tempHolder = (numberOne + numberTwo) - numberThree;

        System.out.println("Values after movement: " + numberOne + " " + numberTwo + " " + numberThree);
        System.out.println("Mathematical expression to be solved:");
        System.out.println("(" + numberOne + " + " + numberTwo + ") - " + numberThree + " =");
        System.out.println("= "+ (numberOne + numberTwo) + " - " + numberThree + " =");
        System.out.println("= " + tempHolder);
    }

    private int getIntegerFromConsole(Scanner scanner) {
        boolean correctInput = false;
        int result = 0;
        do {
            System.out.print("Please enter a valid integer number (and press Enter): ");
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
