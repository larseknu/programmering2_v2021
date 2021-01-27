package no.hiof.larseknu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* *************
         *    Array    *
         *************** */
	    // Initialiserer en array med String'er
        String[] dyreNavn = new String[5];
        // Legger inn String-verdier på alle plassene i array'en
        dyreNavn[0] = "Fido";
        dyreNavn[1] = "Nala";
        dyreNavn[2] = "Misti";
        dyreNavn[3] = "Dagros";
        dyreNavn[4] = "Nils";

        // Printer ut navnet fra plassering 2 i array-en
        System.out.println(dyreNavn[2]);


        // Initialiserer en array med inter, med 12 tall som representerer månedene
        // Gir verdier til alle elementene i arrayet med en gang
        int[] maaneder = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };



        // Initialiserer en array med Dyr-objekter
        Dyr[] dyreArray = new Dyr[3];
        // Oppretter og initaliserer et Dyr-objekt
        Dyr etDyr = new Dyr("Misti", "katt", 11);

        // Fuller array-en med Dyr-objekter
        dyreArray[0] = etDyr;
        dyreArray[1] = new Dyr("Rusken", "hund", 4);
        // Kommenter bort linjen under for å se at vi får en NullPointerException
        dyreArray[2] = new Dyr("Dagros", "ku", 8);

        System.out.println("\n*************Utskrift fra Array************");
        // Lager en løkke som kjører like mange ganger som lengden til dyreArray
        for (int i = 0; i < dyreArray.length; i++) {
            System.out.println(dyreArray[i].getNavn() + " er en " + dyreArray[i].getArt());
        }



        /* *************
         *   ArrayList  *
         *************** */
        // Initialiserer en liste med dyr
        ArrayList<Dyr> dyreListe = new ArrayList<>();
        // Fyller lista med Dyr-objekter
        dyreListe.add(etDyr);
        dyreListe.add(new Dyr("Rusken", "hund", 4));
        dyreListe.add(new Dyr("Dagros", "ku", 5));
        dyreListe.add(new Dyr("Nils", "honninggrevling", 6));

        // Sjekker om et objekt finnes i listen
        if (dyreListe.contains(etDyr))
            System.out.println("\n" + etDyr.getNavn() + " finnes i listen\n");

        // Tar bort et spesifikt objekt i listen hvis det eksisterer
        dyreListe.remove(etDyr);
        // Tar bort et dyr fra en spesifik plassering i listen
        dyreListe.remove(0);

        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Utskrift fra ArrayList************");
        // Går gjennom listen og skriver ut informasjon om dyrene
        for (int i = 0; i < dyreListe.size(); i++) {
            System.out.println(dyreListe.get(i).getNavn() + " er en " + dyreListe.get(i).getArt() );
        }



    }
}
