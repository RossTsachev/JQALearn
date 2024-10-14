package Homework6;

public class AnimalDemo {
    public static void main( String[] args ) {
        Bird bird = new Bird("Johnatan", "black");
        bird.play();
        bird.makeSomeNoise();
        bird.fly();
        bird.synk();
        bird.synk(4);

        Cat cat = new Cat("Garfield", "orange");
        cat.play();
        cat.makeSomeNoise();
        cat.climp("tree");

        Dog dog = new Dog("Scooby", "brown");
        dog.play();
        dog.makeSomeNoise();
        dog.bringStick();
    }
}
