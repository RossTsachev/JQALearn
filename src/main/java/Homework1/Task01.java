package Homework1;

import java.util.Scanner;
import java.util.HashMap;

public class Task01 {

    HashMap numbers = new HashMap();

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String location;
        String finalMessage;

        Task01 task1 = new Task01();
        task1.extractNumber(scanner, "first");
        task1.extractNumber(scanner, "second");
        task1.extractNumber(scanner, "third");

        location = task1.checkThirdNumber() ? "inside" : "outside";

        finalMessage = "Third number " + task1.numbers.get("third") + " is " + location + " numbers "
        + task1.numbers.get("first") + " and " + task1.numbers.get("second");

        System.out.println(finalMessage);
    }

    private void extractNumber(Scanner scanner, String key) {
        boolean correctInput = false;
        String capitalKey;
        capitalKey = key.substring(0,1).toUpperCase() + key.substring(1).toLowerCase();
        do {
            System.out.print("Please enter " + key + " number (and press Enter): ");
            if (scanner.hasNextInt()){
                this.numbers.put(key, scanner.nextInt());
                System.out.println(capitalKey + " number is integer with value of " + this.numbers.get(key));
                correctInput = true;
            } else if (scanner.hasNextDouble()) {
                this.numbers.put(key, scanner.nextDouble());
                System.out.println(capitalKey + " number is double with value of " + this.numbers.get(key));
                correctInput = true;
            } else {
                scanner.nextLine(); //used to consume the \n symbol and prevent endless loop
                System.out.println("Incorrect value!");
            }
        } while (!correctInput);
    }

    private boolean checkThirdNumber() {
        double firstNumber;
        double secondNumber;
        double thirdNumber;

        firstNumber = this.getDoubleValue("first");
        secondNumber = this.getDoubleValue("second");
        thirdNumber = this.getDoubleValue("third");

        if (firstNumber > secondNumber) {
            return (thirdNumber < firstNumber) && (thirdNumber > secondNumber);
        }

        return (thirdNumber > firstNumber) && (thirdNumber < secondNumber);
    }

    private double getDoubleValue(String key) {
        double value;

        if (this.numbers.get(key) instanceof Integer) {
            value = ((Integer) this.numbers.get(key));
        } else {
            value = (double) this.numbers.get(key);
        }

        return value;
    }

}