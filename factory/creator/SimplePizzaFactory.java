package factory.creator;

import factory.product.GreekPizza;
import factory.product.Pizza;

public class SimplePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        return new GreekPizza();
    }
}
