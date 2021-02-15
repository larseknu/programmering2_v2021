package no.hiof.larseknu;

public class Rektangel extends Figur {
    private double side1, side2;

    public Rektangel(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rektangel(double side1, double side2, String farge) {
        super(farge);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public final double areal() {
        return side1 * side2;
    }

    @Override
    public double omkrets() {
        return side1 * 2 + side2 * 2;
    }

    @Override
    public String toString() {
        return "Rektangel med sidene " + side1 + " og " + side2 +
                " har arealet: " + areal() + " og omkrets " + omkrets();
    }
}
