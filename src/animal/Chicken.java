package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: ó ó ó";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
