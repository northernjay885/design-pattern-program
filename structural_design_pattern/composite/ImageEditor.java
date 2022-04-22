package structural_design_pattern.composite;

import java.util.List;

public class ImageEditor {

    public void load() {
        CompoundGraphic all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
    }

    public void groupSelected(List<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic component : components) {
            group.add(component);
        }
    }
}
