package no.hiof.larseknu;

public final class Kvadrat extends Rektangel {
    private double side;

    public Kvadrat(double side) {
        super(side, side);

        this.side = side;
    }

    @Override
    public void tegn() {
        System.out.println(" ---");
        System.out.println("|   |");
        System.out.println(" ---");
    }

    @Override
    public String toString() {
        return "Kvadrat med " + side +
                " har arealet: " + areal() + " og omkretsen " + omkrets();
    }
}
