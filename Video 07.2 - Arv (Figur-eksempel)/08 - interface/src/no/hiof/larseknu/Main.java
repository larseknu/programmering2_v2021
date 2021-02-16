package no.hiof.larseknu;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Rektangel etRektangel = new Rektangel(5, 6);
        Sirkel enSirkel = new Sirkel(8);
        Kvadrat kvadratet = new Kvadrat(5);

        ArrayList<Figur> figurListe = new ArrayList<>();

        figurListe.add(etRektangel);
        figurListe.add(enSirkel);
        figurListe.add(kvadratet);

        System.out.println("***********Usortert liste*****************");
        for (Figur enFigur: figurListe) {
            System.out.println(enFigur);
        }

        Collections.sort(figurListe);

        System.out.println("***********Sortert liste*****************");
        for (Figur enFigur: figurListe) {
            System.out.println(enFigur);
        }

        for (Figur enFigur: figurListe) {
            if (enFigur instanceof Tegnbar) {
                ((Tegnbar) enFigur).tegn();
            }
        }

    }
}
