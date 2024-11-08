package src.practice6;

public class Restaurant {
    boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (!eater.isEatingCrust) {
            // threw it out of dish
        }
        //wash
        return true;
    }
}

