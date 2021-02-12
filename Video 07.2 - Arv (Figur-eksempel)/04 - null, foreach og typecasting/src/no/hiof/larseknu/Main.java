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


        Figur[] figurer = new Figur[3];
        figurer[0] = etRektangel;
        figurer[1] = enSirkel;
        figurer[2] = kvadratet;
        //figurer[3] -> null
        //figurer[4] -> null

        System.out.println("\n*************Utskrift fra array - figurer************");

        for (Figur enFigur : figurer) {
            System.out.println(enFigur.areal());


            if (enFigur instanceof Sirkel) {
                Sirkel sirkelen = (Sirkel)enFigur;
                System.out.println("Diameter: " + sirkelen.getDiameter());
            }
        }

        /*for (int i = 0; i < figurer.length; i++) {
            Figur enFigur = figurer[i];

            System.out.println(enFigur.areal());
        }*/


    }

    public static boolean erStorre(Figur figur1, Figur figur2) {
        return figur1.areal() > figur2.areal();
    }

}
