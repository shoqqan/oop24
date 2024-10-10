package src.practice3.problem1;

public class Animal {
    private String name;
    public Animal(String name) {
        this.name=name;
    }
    public void sound(){
        System.out.println(this.name + " is sound");
    }
    public void sound(Boolean isAgressive){
        if (isAgressive){
            System.out.println(this.name + " sound loudly with aggressiveness ");
            return;
        }
        this.sound();
    }
    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }

}
