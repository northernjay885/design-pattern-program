package creational_design_pattern.factory;

import creational_design_pattern.factory.creator.ComplicatedPizzaFactory;
import creational_design_pattern.factory.creator.PizzaType;
import creational_design_pattern.factory.creator.SimplePizzaFactory;
import creational_design_pattern.factory.product.Pizza;

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
