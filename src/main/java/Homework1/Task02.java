package Homework1;

import java.util.Scanner;

public class Task02 {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int firstNumberInteger;
        double firstNumberDouble;
        int secondNumberInteger;
        double secondNumberDouble;
        int thirdNumberInteger;
        double thirdNumberDouble;
        int fourthNumberInteger;
        double fourthNumberDouble;

        Task02 task2 = new Task02();
        firstNumberInteger = task2.getIntegerFromConsole(scanner);
        secondNumberDouble = task2.getDoubleFromConsole(scanner);
        thirdNumberInteger = task2.getIntegerFromConsole(scanner);
        fourthNumberDouble = task2.getDoubleFromConsole(scanner);

        System.out.println("The entered values are: " + firstNumberInteger + " " + secondNumberDouble + " " + thirdNumberInteger
                + " " + fourthNumberDouble);

        firstNumberDouble = (double) firstNumberInteger;
        secondNumberInteger = (int) secondNumberDouble;
        thirdNumberDouble = (double) thirdNumberInteger;
        fourthNumberInteger = (int) fourthNumberDouble;

        System.out.println("The values after casted from integer to double and vice versa are: " + firstNumberDouble
                + " " + secondNumberInteger + " " + thirdNumberDouble + " " + fourthNumberInteger);

        firstNumberInteger = (int) firstNumberDouble;
        secondNumberDouble = (double) secondNumberInteger;
        thirdNumberInteger = (int) thirdNumberDouble;
        fourthNumberDouble = (double) fourthNumberInteger;

        System.out.println("The values after casted again from integer to double and vice versa are: " + firstNumberInteger
                + " " + secondNumberDouble + " " + thirdNumberInteger + " " + fourthNumberDouble);

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

    private double getDoubleFromConsole(Scanner scanner) {
        boolean correctInput = false;
        double result = 0;
        do {
            System.out.print("Please enter a valid double number (and press Enter): ");
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
