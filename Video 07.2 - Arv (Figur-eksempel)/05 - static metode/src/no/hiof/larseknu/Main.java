package no.hiof.larseknu;

public class Main {

    public static void main(String[] args) {
        double side1 = Double.parseDouble(args[0]);
        double side2 = Double.parseDouble(args[1]);

        Rektangel etRektangelFraArgs = new Rektangel(side1, side2);

        System.out.println("Arealet er: " + etRektangelFraArgs.areal());

        Rektangel etRektangel = new Rektangel(5, 6);
        Sirkel enSirkel = new Sirkel(8);
        Kvadrat kvadratet = new Kvadrat(5);

        System.out.println("\n*************Hvilken er størst?************");

        if (Figur.erStorreStatic(etRektangel, kvadratet))
            System.out.println("Rektangelet størst");
        else
            System.out.println("Kvadratet er størst");


        if (etRektangel.erStorre(enSirkel))
            System.out.println("Rektangelet størst");
        else
            System.out.println("Sirkelen er størst");

    }



}
