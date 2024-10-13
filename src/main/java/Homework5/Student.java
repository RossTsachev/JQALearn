package Homework5;

public class Student extends Person {
    protected double score;

    public Student (String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        if (score < 2 || score > 6) {
            throw new IllegalArgumentException("Value for score should be between 2.00 and 6.00");
        }
        this.score = score;
    }

    public void showStudentInfo() {
        System.out.printf("Student Info: %s (%s, %d years old) with score of %,.2f%n", this.name, this.getGenderName(),
                this.age, this.score);
    }
}
