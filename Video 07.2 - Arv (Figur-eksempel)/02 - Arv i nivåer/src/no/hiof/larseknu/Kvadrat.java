package no.hiof.larseknu;

public class Kvadrat extends Rektangel {
    private double side;

    public Kvadrat(double side) {
        super(side, side);

        this.side = side;
    }

    @Override
    public String toString() {
        return "Kvadrat med " + side +
                " har arealet: " + areal() + " og omkretsen " + omkrets();
    }
}
