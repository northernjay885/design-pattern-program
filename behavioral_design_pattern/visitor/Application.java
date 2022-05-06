package behavioral_design_pattern.visitor;

import java.util.List;

public class Application {
    List<Shape> shapeList;

    public void export() {
        Visitor exportVisitor = new XMLExportVisitor();
        for (Shape shape : shapeList) {
            shape.accept(exportVisitor);
        }
    }
}
