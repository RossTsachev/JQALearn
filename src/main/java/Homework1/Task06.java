package Homework1;

import java.util.Scanner;

public class Task06 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Task06 task6 = new Task06();
        int dayOfWeek;

        dayOfWeek = task6.getDayOfWeek(scanner);

        switch (dayOfWeek) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Day of week not found");
                break;
        }


    }

    private int getDayOfWeek(Scanner scanner) {
        boolean correctInput = false;
        int result = 0;
        do {
            System.out.print("Please enter number for day of week between 1 and 7 (and press Enter): ");
            if (scanner.hasNextInt()){
                result = scanner.nextInt();
                if ((result >= 1) && (result <=7)) {
                    correctInput = true;
                } else {
                     System.out.println("Incorrect value for day of week - must be between 1 and 7!");
                }
            } else {
                scanner.nextLine(); //used to consume the \n symbol and prevent endless loop
                System.out.println("Incorrect value for working hours - must be a whole number!");
            }
        } while (!correctInput);

        return result;
    }
}
