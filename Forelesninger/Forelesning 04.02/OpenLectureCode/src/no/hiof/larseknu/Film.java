package no.hiof.larseknu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Film {
    private String tittel;
    private String sjanger;
    private int spilleTid;
    private LocalDate lanseringsDato;
    private Person regissor;
    private ArrayList<Person> skuespillere = new ArrayList<>();

    public Film(String tittel, String sjanger, int spilleTid, LocalDate lanseringsDato, Person regissor) {
        this.tittel = tittel;
        this.sjanger = sjanger;
        this.spilleTid = spilleTid;
        this.lanseringsDato = lanseringsDato;
        this.regissor = regissor;
    }

    public void leggTilSkuespiller(Person skuespiller) {
        skuespillere.add(skuespiller);
    }

    public ArrayList<Person> getSkuespillere() {
        return new ArrayList<>(skuespillere);
    }

    /* public Person getEldsteSkuespiller() {
        // Person objekt som holder på eldste

        // lage en løkke som går gjennom alle skuespillere
            // sammenligne nåværende eldste, med hver person i lista
            // eldstePerson.getAlder() < lokkePerson.getAlder();
                // eldstePerson = lokkePerson;

        returner eldste person
    */


    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getSjanger() {
        return sjanger;
    }

    public void setSjanger(String sjanger) {
        this.sjanger = sjanger;
    }

    public int getSpilleTid() {
        return spilleTid;
    }

    public void setSpilleTid(int spilleTid) {
        this.spilleTid = spilleTid;
    }

    public LocalDate getLanseringsDato() {
        return lanseringsDato;
    }

    public void setLanseringsDato(LocalDate lanseringsDato) {
        this.lanseringsDato = lanseringsDato;
    }

    public Person getRegissor() {
        return regissor;
    }

    public void setRegissor(Person regissor) {
        this.regissor = regissor;
    }
}
