package structural_design_pattern.composite;

import java.util.List;

public class CompoundGraphic implements Graphic {

    private List<Graphic> graphicList;

    @Override
    public void move(int x, int y) {
        for (Graphic child : graphicList) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        //...
    }

    public void add(Graphic child) {
        graphicList.add(child);
    }

    public void remove(Graphic child) {
        graphicList.remove(child);
    }
}
