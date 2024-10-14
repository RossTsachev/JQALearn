package Homework6;

public class Bird extends Animal{

    public Bird(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSomeNoise() {
        System.out.printf("The %s bird named %s makes some noise.%n", this.color, this.name);
    }

    @Override
    public void play() {
        System.out.printf("The %s bird named %s is playing.%n", this.color, this.name);
    }

    public void fly() {
        System.out.printf("The %s bird named %s flies.%n", this.color, this.name);
    }

    public void synk() {
        System.out.printf("The %s bird named %s sings.%n", this.color, this.name);
    }

    public void synk(int flockSize) {
        if (flockSize < 2) {
            this.synk();
        } else {
            System.out.printf("The %s bird named %s sings with %d other birds.%n", this.color, this.name, flockSize);
        }
    }
}
