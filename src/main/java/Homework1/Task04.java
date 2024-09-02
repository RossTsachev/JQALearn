package Homework1;

import java.util.Scanner;

public class Task04 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Task04 task4 = new Task04();
        int workingHours;
        double money;
        boolean isFreeDay;
        String finalMessage;

        workingHours = task4.getWorkingHours(scanner);
        money = task4.getAvailableMoney(scanner);
        isFreeDay = task4.getIsItFreeDay(scanner);

        finalMessage = (isFreeDay) ? "Today is free day, " : "Today is not free day, ";
        finalMessage += "I have " + workingHours + " working hours, ";
        finalMessage += "and " + money + "$ money. ";

        if (isFreeDay) {
            if (money >= 10) {
                finalMessage += "Therefore I will go to the cinema.";
            } else if (money > 0) {
                finalMessage += "Therefore I will go to buy ice-cream.";
            } else {
                finalMessage += "Therefore I will stay home and watch TV.";
            }
        } else {
            finalMessage += "Therefore I will go to work.";
        }

        System.out.println(finalMessage);
    }

    private int getWorkingHours(Scanner scanner) {
        boolean correctInput = false;
        int result = 0;
        do {
            System.out.print("Please enter number of working hours (and press Enter): ");
            if (scanner.hasNextInt()){
                result = scanner.nextInt();
                correctInput = true;
            } else {
                scanner.nextLine(); //used to consume the \n symbol and prevent endless loop
                System.out.println("Incorrect value for working hours - must be a whole number!");
            }
        } while (!correctInput);

        return result;
    }

    private double getAvailableMoney(Scanner scanner) {
        boolean correctInput = false;
        double result = 0;
        do {
            System.out.print("Please enter available money (and press Enter): ");
            if (scanner.hasNextDouble()) {
                result = scanner.nextDouble();
                correctInput = true;
            } else {
                scanner.nextLine(); //used to consume the \n symbol and prevent endless loop
                System.out.println("Incorrect value for available money - must be number!");
            }
        } while (!correctInput);

        return result;
    }

    private boolean getIsItFreeDay(Scanner scanner) {
        boolean correctInput = false;
        boolean result = false;
        do {
            System.out.print("Please enter if it is free day - true or false (and press Enter): ");
            if (scanner.hasNextBoolean()) {
                result = scanner.nextBoolean();
                correctInput = true;
            } else {
                scanner.nextLine(); //used to consume the \n symbol and prevent endless loop
                System.out.println("Incorrect value for free day - must be true or false!");
            }
        } while (!correctInput);

        return result;
    }
}
