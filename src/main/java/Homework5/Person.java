package Homework5;

public class Person {
    protected String name;
    protected int age;
    protected boolean isMan;

    public Person (String name, int age, boolean isMan) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Value for age should be between 0 and 120");
        }
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public void showPersonInfo() {
        System.out.printf("Person Info: %s (%s, %d years old)%n", this.name, this.getGenderName(), this.age);
    }

    protected String getGenderName() {
        return this.isMan ? "Male" : "Female";
    }
}
