package no.hiof.larseknu;

public class Main {

    public static void main(String[] args) {
        Rektangel etRektangel = new Rektangel(5, 6);
        Sirkel enSirkel = new Sirkel(8);

        System.out.println(etRektangel.toString());
        System.out.println("Rektangelet har arealet: " + etRektangel.areal());
        System.out.println(enSirkel.toString());
        System.out.println("Sirkelen har arealet: " + enSirkel.areal());
    }

}
