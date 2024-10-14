package Homework6;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSomeNoise() {
        System.out.printf("The %s dog named %s makes some noise.%n", this.color, this.name);
    }

    @Override
    public void play() {
        System.out.printf("The %s dog named %s is playing.%n", this.color, this.name);
    }

    public void bringStick() {
        System.out.printf("The %s dog named %s brings back the stick.%n", this.color, this.name);
    }
}
