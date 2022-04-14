package factory;

import factory.creator.ComplicatedPizzaFactory;
import factory.creator.PizzaType;
import factory.creator.SimplePizzaFactory;
import factory.product.Pizza;

public class Solution {

    public static void main(String[] args) {

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza simplePizza = simplePizzaFactory.createPizza(PizzaType.CHEESE);
        simplePizza.prepare();
        simplePizza.bake();
        simplePizza.cut();
        simplePizza.box();

        ComplicatedPizzaFactory complicatedPizzaFactory = new ComplicatedPizzaFactory();
        Pizza cheesePizza = complicatedPizzaFactory.createPizza(PizzaType.CHEESE);
        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();

        Pizza veggiePizza = complicatedPizzaFactory.createPizza(PizzaType.VEGGIE);
        veggiePizza.prepare();
        veggiePizza.bake();
        veggiePizza.cut();
        veggiePizza.box();

    }
}
