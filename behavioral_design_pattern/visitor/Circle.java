package behavioral_design_pattern.visitor;

public class Circle extends Dot {

    @Override
    public void accept(Visitor v) {
        v.visitCircle(this);
    }
}
