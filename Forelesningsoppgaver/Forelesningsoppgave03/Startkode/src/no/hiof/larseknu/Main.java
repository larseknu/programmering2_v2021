package no.hiof.larseknu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TVSerie strangerThings = new TVSerie("Stranger Things",
                "When a young boy disappears, his mother, a police chief, and his friends must confront terrifying forces in order to get him back.",
                LocalDate.of(2016, 7,15));


        Episode episode1 = new Episode("Chapter One: The Vanishing of Will Byers", 1, 1, 50);
        Episode episode2 = new Episode("Chapter Two: The Weirdo on Maple Street", 2, 1, 50);
        Episode episode3 = new Episode("Chapter Three: Holly, Jolly", 3, 1, 50);
        Episode episode4 = new Episode("Chapter Four: The Body", 4, 1, 50);

        strangerThings.leggTilEpisode(episode1);
        strangerThings.leggTilEpisode(episode2);
        strangerThings.leggTilEpisode(episode3);
        strangerThings.leggTilEpisode(episode4);

        strangerThings.leggTilEpisode(new Episode("Chapter One: MADMAX", 1, 2, 50));
        strangerThings.leggTilEpisode(new Episode("Chapter Two: Trick or Treat, Freak", 2, 2, 50));
        strangerThings.leggTilEpisode(new Episode("Chapter Three: The Pollywog", 3, 2, 50));

        ArrayList<Episode> episodeListe = strangerThings.getEpisodeListe();

        System.out.println("**************************");
        System.out.println("* " + strangerThings + " *");
        System.out.println("**************************");
        System.out.println("-------Alle Episoder------");


        for (Episode enEpisode : episodeListe) {
            System.out.println(enEpisode);
        }

        System.out.println("**************************\n");
    }
}
