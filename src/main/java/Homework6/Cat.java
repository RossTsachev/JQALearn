package Homework6;

public class Cat extends Animal{

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSomeNoise() {
        System.out.printf("The %s cat named %s makes some noise.%n", this.color, this.name);
    }

    @Override
    public void play() {
        System.out.printf("The %s cat named %s is playing.%n", this.color, this.name);
    }

    public void climp(String surface) {
        System.out.printf("The %s cat named %s climbs on the %s.%n", this.color, this.name, surface);
    }
}
