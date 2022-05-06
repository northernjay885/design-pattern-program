package behavior_design_pattern.template_method;

public abstract class GameAI {

    public void turn() {
        collectResources();
        buildStructure();
        buildUnits();
        attack();
    }

    public void collectResources() {
        // detailed implementation.
    }

    abstract void buildStructure();

    abstract void buildUnits();

    public void attack() {
        // detailed implementation.
    }

    abstract void sendScouts(int position);

    abstract void sendWarriors(int position);

}
