package creational_design_pattern.factory.creator;

import creational_design_pattern.factory.product.GreekPizza;
import creational_design_pattern.factory.product.Pizza;

public class SimplePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        return new GreekPizza();
    }
}
