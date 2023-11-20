public class AnimalDriver {
    public static void main(String[] args) {
        Animal Spot = new Dog();
        Animal Perry = new Bird();

        Spot.makeSound();
        Perry.makeSound();

        Spot.move();
        Perry.move();

        Dog Rico = new Dog();

        Rico.misbehave("Homework");


    }
}
