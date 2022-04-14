package prototype.impl;

import prototype.Shape;

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}
