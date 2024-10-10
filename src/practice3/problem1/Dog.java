package src.practice3.problem1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void sound(){
        System.out.println("The dog barks");
    }

}
