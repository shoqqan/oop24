package src.practice3.problem1;

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.sound();
        genericAnimal.sleep();
        genericAnimal.sound(true);


        Dog dog = new Dog("Buddy");
        dog.sound();
        dog.sleep();
    }
}
