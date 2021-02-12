package no.hiof.larseknu;

public class Main {

    public static void main(String[] args) {
        Rektangel etRektangel = new Rektangel(5, 6);
        Sirkel enSirkel = new Sirkel(8);
        Kvadrat kvadratet = new Kvadrat(5);

        System.out.println("\n*************Data om figur************");
        System.out.printf("Rektangelet sitt areal er %.2f\n", etRektangel.areal());
        System.out.printf("Rektangelet sitt areal i meter er %.2f\n", etRektangel.arealIMeter());
    }


}
