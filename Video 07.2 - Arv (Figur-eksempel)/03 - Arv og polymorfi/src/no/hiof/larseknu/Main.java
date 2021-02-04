package no.hiof.larseknu;

public class Main {

    public static void main(String[] args) {
        Rektangel etRektangel = new Rektangel(5, 6);
        Sirkel enSirkel = new Sirkel(8);
        Kvadrat kvadratet = new Kvadrat(5);

        System.out.println(etRektangel.toString());
        System.out.println("Rektangelet har arealet: " + etRektangel.areal());
        System.out.println(enSirkel.toString());
        System.out.println("Sirkelen har arealet: " + enSirkel.areal());
        System.out.println(kvadratet.toString());

        System.out.println("\n*************Hvilken er størst?************");

        if (erStorre(etRektangel, kvadratet))
            System.out.println("Rektangelet størst");
        else
            System.out.println("Kvadratet er størst");

    }

    public static boolean erStorre(Figur figur1, Figur figur2) {
        return figur1.areal() > figur2.areal();
    }

}
