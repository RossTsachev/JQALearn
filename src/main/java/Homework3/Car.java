package Homework3;

public class Car {
    int year;
    double price;
    boolean isSportCar;
    double fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {
        this.engineFuelOperationSystem = newEngineFuelOperationSystem;
    }

    public void useFuel(double fuel) {
        if (fuel > freeFuel) {
            System.out.println("Not enough free fuel!");
        } else {
            this.freeFuel -= fuel;
        }
    }
}
