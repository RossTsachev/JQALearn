package Homework6;

public abstract class Animal implements IAnimal {
    protected String name;
    protected String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void play() {
        System.out.printf("The %s animal named %s is playing.%n", this.color, this.name);
    }
}
