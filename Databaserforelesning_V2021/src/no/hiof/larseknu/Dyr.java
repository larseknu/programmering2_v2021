package no.hiof.larseknu;

import java.time.LocalDate;

public class Dyr {
    private int id;
    private String navn, art;
    private LocalDate fodselsdato;

    public Dyr(int id, String navn, String art, LocalDate fodselsdato) {
        this.id = id;
        this.navn = navn;
        this.art = art;
        this.fodselsdato = fodselsdato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public LocalDate getFodselsdato() {
        return fodselsdato;
    }

    public void setFodselsdato(LocalDate fodselsdato) {
        this.fodselsdato = fodselsdato;
    }

    @Override
    public String toString() {
        return "Dyr{" +
                "id=" + id +
                ", navn='" + navn + '\'' +
                ", art='" + art + '\'' +
                ", fodselsdato=" + fodselsdato +
                '}';
    }
}
