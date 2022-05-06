package behavioral_design_pattern.visitor;

public interface Visitor {

    void visitDot(Dot dot);
    void visitCircle(Circle c);
    void visitRectangle(Rectangle r);
    void visitCompoundShape(CompoundShape cs);
}
