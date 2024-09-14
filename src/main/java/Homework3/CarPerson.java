package Homework3;

public class CarPerson {
    public static void main( String[] args ) {
        Car ferrari = new Car();
        Car vwGolf = new Car();

        ferrari.year = 2005;
        ferrari.price = 99999.98;
        ferrari.fuelTankCapacity = 120;
        ferrari.freeFuel = 100;
        ferrari.engineFuelOperationSystem = "gasoline";
        ferrari.isSportCar = true;

        vwGolf.year = 2021;
        vwGolf.price = 19999.99;
        vwGolf.fuelTankCapacity = 80;
        vwGolf.freeFuel = 40;
        vwGolf.engineFuelOperationSystem = "diesel";

        ferrari.useFuel(35);
        vwGolf.changeEngineFuelOperationSystem("gas");

        printCarAttributes(ferrari);
        printCarAttributes(vwGolf);
    }

    private static void printCarAttributes(Car car) {
        System.out.printf("Car stats: %n  Year: %d %n  Price: %,.2f$ %n  Sport: %b %n  Fuel tank capacity: %,.1fL %n"
                + "  Free fuel: %.1fL %n  Engine fuel operations system: %s %n%n" , car.year, car.price, car.isSportCar,
                car.fuelTankCapacity, car.freeFuel, car.engineFuelOperationSystem);
    }
}
