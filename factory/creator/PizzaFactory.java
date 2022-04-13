package factory.creator;

import factory.product.Pizza;

public abstract class PizzaFactory {
    public abstract Pizza createPizza(PizzaType pizzaType);
}
