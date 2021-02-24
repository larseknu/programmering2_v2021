package no.hiof.larseknu.hellojavalin.model;

import java.time.LocalDate;

public class Sjimpanse extends Dyr {
    private int iq;

    public Sjimpanse(String navn, LocalDate fodselsDato, int iq) {
        super(navn, fodselsDato);
        this.iq = iq;
    }

    /*@Override
    public int getID() {
        return 1337;
    }*/

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
