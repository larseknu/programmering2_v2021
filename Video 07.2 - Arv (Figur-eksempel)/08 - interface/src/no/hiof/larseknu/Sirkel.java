package no.hiof.larseknu;

public class Sirkel extends Figur {
    private double radius;

    public Sirkel(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double areal() {
        return Math.PI * radius * radius;
    }

    @Override
    public double omkrets() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public String toString() {
        return "Sirkelen med radius " + radius +
                " har arealet: " + areal() + " og omkrets " + omkrets();
    }

    @Override
    public void tegn() {
        System.out.println("   ---");
        System.out.println(" /     \\");
        System.out.println("|       |");
        System.out.println(" \\     /");
        System.out.println("   ---");
    }
}
