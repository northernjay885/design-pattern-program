package creational_design_pattern.factory.creator;

import creational_design_pattern.factory.product.*;

public class ComplicatedPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE -> new CheesePizza();
            case VEGGIE -> new VeggiePizza();
            case PEPPERONI -> new PepperoniPizza();
            default -> new GreekPizza();
        }
        return null;
    }
}
