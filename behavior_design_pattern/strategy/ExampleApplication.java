package behavior_design_pattern.strategy;

public class ExampleApplication {

    private String action;
    private Context context;

    public void main(String[] args) {
        if ("addtion".equals(action)) {
            context.setStrategy(new ConcreteStrategyAdd());
        }
        if ("subtraction".equals(action)) {
            context.setStrategy(new ConcreteStrategySubtract());
        }
        if ("multiplication".equals(action)) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.executeStrategy(10, 10);
    }
}
