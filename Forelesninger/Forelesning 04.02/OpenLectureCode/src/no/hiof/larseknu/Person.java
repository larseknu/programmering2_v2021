package no.hiof.larseknu;

import java.time.LocalDate;

public class Person {
    private String fornavn, etternavn;
    private LocalDate fodselsdato;

    public Person(String fornavn, String etternavn, LocalDate fodselsdato) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsdato = fodselsdato;
    }

    public int getAlder() {
        return LocalDate.now().getYear() - fodselsdato.getYear();
    }

    public String getNavn() {
        return fornavn + " " + etternavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public LocalDate getFodselsdato() {
        return fodselsdato;
    }

    public void setFodselsdato(LocalDate fodselsdato) {
        this.fodselsdato = fodselsdato;
    }
}
