package Homework5;

public class Demonstration {
    public static void main( String[] args ) {
        Person[] people;
        people = new Person[10];

        people[0] = new Person("John", 30, true);
        people[1] = new Person("Elena", 28, false);

        people[2] = new Student("Mark", 19, true, 4.5);
        people[3] = new Student("Jessica", 21, false, 5.85);

        people[4] = new Employee("Rick", 45, true, 240);
        people[5] = new Employee("Sarah", 14, false, 320);

        for (Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Employee) {
                ((Employee) person).showEmployeeInfo();
            } else if (person != null) {
                person.showPersonInfo();
            }
        }

        for (Person person : people) {
            if (person instanceof Employee) {
                double overtime = ((Employee) person).calculateOvertime(2);
                ((Employee) person).showOvertime(overtime);
            }
        }

    }
}
