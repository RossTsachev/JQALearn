package Homework5;

public class Employee extends Person {
    protected double daySalary;

    public Employee (String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        if (daySalary < 0) {
            throw new IllegalArgumentException("Value for daily salary cannot be negative");
        }
        this.daySalary = daySalary;
    }

    public void showEmployeeInfo() {
        System.out.printf("Employee Info: %s (%s, %d years old) with daily salary of %,.2f$%n", this.name,
                this.getGenderName(), this.age, this.daySalary);
    }

    public double calculateOvertime(int hours) {
        if (this.age < 18) {
            return 0;
        }
        double ratePerHour = this.daySalary / 8;

        return ratePerHour * hours;
    }

    public void showOvertime(double overtime) {
        System.out.printf("%s overtime amount: %,.2f$%n", this.name, overtime);
    }
}
