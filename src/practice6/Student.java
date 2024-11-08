package src.practice6;

import src.practice3.problem2.Person;

public class Student extends Person implements CanHavePizza, CanHaveParty, CanHaveRetake {
    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public void eatPizza() {
        if (this.isEatingCrust) {
            System.out.println("Eating...");
        } else {
            System.out.println("Eating and throw crusts to dish");
        }
    }

    @Override
    public void dance() {
        System.out.println("Dancing");
    }

    @Override
    public void talkWithTeacher() {
        System.out.println("Please don't retake me!!!");
    }
}
