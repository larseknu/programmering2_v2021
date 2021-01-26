package no.hiof.larseknu;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSerie {
    private String tittel, beskrivelse;
    private LocalDate utgivelsesdato;
    private ArrayList<Episode> episodeListe;

    public TVSerie(String tittel, String beskrivelse, LocalDate utgivelsesdato) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = utgivelsesdato;
        episodeListe = new ArrayList<>();
    }

    public void leggTilEpisode(Episode episoden) {
        episodeListe.add(episoden);
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public LocalDate getUtgivelsesdato() {
        return utgivelsesdato;
    }

    public void setUtgivelsesdato(LocalDate utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }

    public ArrayList<Episode> getEpisodeListe() {
        return new ArrayList<>(episodeListe);
    }

    @Override
    public String toString() {
        return tittel + " - " + utgivelsesdato.getYear();
    }
}