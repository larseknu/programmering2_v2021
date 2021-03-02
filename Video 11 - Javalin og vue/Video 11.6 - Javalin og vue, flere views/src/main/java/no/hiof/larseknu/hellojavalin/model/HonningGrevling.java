package no.hiof.larseknu.hellojavalin.model;

import java.time.LocalDate;

public class HonningGrevling extends Dyr {
    private int antallSlangerDrept;

    public HonningGrevling(String navn, LocalDate fodselsDato) {
        super(navn, fodselsDato);
        antallSlangerDrept = 0;
    }

    public int getAntallSlangerDrept() {
        return antallSlangerDrept;
    }

    public void dreptEnSlangeTil() {
        antallSlangerDrept++;
    }
}
