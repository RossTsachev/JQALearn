package Homework4;

import java.util.HashMap;

public class ComputerPrices {
    public static void main( String[] args ) {
        Computer firstComputer = new Computer();
        firstComputer.year = 2022;
        firstComputer.price = 1999.98;
        firstComputer.operationSystem = "Windows 11";

        Computer secondComputer = new Computer(2020, 1899.98, "Linux Debian");

        outputInConsole(firstComputer, secondComputer);
    }

    private static void outputInConsole(Computer firstComputer, Computer secondComputer) {
        String output = displayComputerData(firstComputer)
                + displayCompareValue(firstComputer.comparePrice(secondComputer))
                + displayComputerData(secondComputer);

        output = output.substring(0, 1).toUpperCase() + output.substring(1);

        System.out.println(output);
    }

    private static String displayComputerData(Computer computer) {
        return String.format("the computer from %d with a %s system and %,.2f$ price",
                computer.year, computer.operationSystem, computer.price);
    }

    private static String displayCompareValue(int compareValue) {
        HashMap<Integer, String> result = new HashMap <>();
        result.put(-1, " is greater than ");
        result.put(0, " is equal to ");
        result.put(1, " is less than ");


        return result.getOrDefault(compareValue, " is undefined compared to ");
    }
}
