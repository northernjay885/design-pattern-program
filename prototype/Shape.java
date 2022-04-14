package prototype;

public abstract class Shape {
    int x;
    int y;
    String color;

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();
}
