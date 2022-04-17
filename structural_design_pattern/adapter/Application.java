package structural_design_pattern.adapter;

public class Application {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largeSquarePeg);

        hole.fits(smallAdapter);
        hole.fits(largeAdapter);
    }
}
