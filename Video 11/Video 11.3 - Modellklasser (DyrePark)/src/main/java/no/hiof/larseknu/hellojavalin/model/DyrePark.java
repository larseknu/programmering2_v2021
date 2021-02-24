package no.hiof.larseknu.hellojavalin.model;

import java.util.ArrayList;

public class DyrePark {
    private String navn;
    private ArrayList<Dyr> dyrIDyreParken = new ArrayList<>();

    public DyrePark(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public ArrayList<Dyr> getDyrIDyreParken() {
        return new ArrayList<Dyr>(dyrIDyreParken);
    }

    public void leggTilEtDyrIDyreparken(Dyr etDyr) {
        dyrIDyreParken.add(etDyr);
    }
}
