package structural_design_pattern.adapter;

public class SquarePegAdapter implements RoundPeg {

    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}
