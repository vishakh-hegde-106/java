// RoundHole class (Target interface)
class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return peg.getRadius() <= radius;
    }
}

// RoundPeg class (Target)
class RoundPeg {
    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

// SquarePeg class (Adaptee)
class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}

// Adapter class
class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth() * Math.sqrt(2) / 2);
        this.squarePeg = squarePeg;
    }
}

// Client code
public class AdapterPatternExample {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5.0);
        RoundPeg roundPeg = new RoundPeg(2.5);
        SquarePeg squarePeg = new SquarePeg(4.0);
        RoundPeg squarePegAdapter = new SquarePegAdapter(squarePeg);

        System.out.println("Round peg fits in round hole? " + roundHole.fits(roundPeg));
        System.out.println("Square peg fits in round hole? " + roundHole.fits(squarePegAdapter));
    }
}
