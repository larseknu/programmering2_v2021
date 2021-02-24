package no.hiof.larseknu.hellojavalin;

import no.hiof.larseknu.hellojavalin.model.DyrePark;
import no.hiof.larseknu.hellojavalin.model.HonningGrevling;
import no.hiof.larseknu.hellojavalin.model.Panda;
import no.hiof.larseknu.hellojavalin.model.Sjimpanse;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        DyrePark kristiansand = new DyrePark("Kristiansand Dyrepark");

        Sjimpanse sjimpansenArne = new Sjimpanse("Arne", LocalDate.of(2018, 2, 3), 60);
        Panda pandaenPernille = new Panda("Pernille", LocalDate.of(2016,3,4), "Svart");
        HonningGrevling honningGrevlingenNils = new HonningGrevling("Nils", LocalDate.of(2020, 1, 1));

        kristiansand.leggTilEtDyrIDyreparken(sjimpansenArne);
        kristiansand.leggTilEtDyrIDyreparken(pandaenPernille);
        kristiansand.leggTilEtDyrIDyreparken(honningGrevlingenNils);

        System.out.println(sjimpansenArne.toString());
        System.out.println(pandaenPernille.toString());
        System.out.println(honningGrevlingenNils.toString());
    }
}
