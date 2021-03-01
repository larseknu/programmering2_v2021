package no.hiof.larseknu.hellojavalin.model;

import java.time.LocalDate;

public class Panda extends Dyr {
    private String kungFuBelteFarge;

    public Panda(String navn, LocalDate fodselsDato, String kungFuBelteFarge) {
        super(navn, fodselsDato);
        this.kungFuBelteFarge = kungFuBelteFarge;
    }

    public String getKungFuBelteFarge() {
        return kungFuBelteFarge;
    }

    public void setKungFuBelteFarge(String kungFuBelteFarge) {
        this.kungFuBelteFarge = kungFuBelteFarge;
    }
}
