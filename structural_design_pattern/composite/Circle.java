package structural_design_pattern.composite;

public class Circle extends Dot {

    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {

    }
}
