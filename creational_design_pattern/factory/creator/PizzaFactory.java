package creational_design_pattern.factory.creator;

import creational_design_pattern.factory.product.Pizza;

public abstract class PizzaFactory {
    public abstract Pizza createPizza(PizzaType pizzaType);
}
