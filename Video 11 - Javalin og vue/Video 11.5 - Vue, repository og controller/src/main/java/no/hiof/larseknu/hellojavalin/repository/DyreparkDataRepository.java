package no.hiof.larseknu.hellojavalin.repository;

import no.hiof.larseknu.hellojavalin.model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class DyreparkDataRepository implements DyreparkRepository {
    private ArrayList<DyrePark> dyreParker = new ArrayList<>();

    public DyreparkDataRepository() {
        DyrePark kristiansandDyrepark = new DyrePark("Kristiansand Dyrepark");

        HonningGrevling honningGrevlingenNils = new HonningGrevling("Nils", LocalDate.of(2013, 3, 2));
        Sjimpanse sjimpansenArne = new Sjimpanse("Arne", LocalDate.of(2017, 3, 17), 60);
        Sjimpanse sjimpansenJulius = new Sjimpanse("Julius", LocalDate.of(2017, 3, 17), 90);
        Panda pandaenTrine = new Panda("Trine", LocalDate.of(2014, 4, 13), "Hvit");

        kristiansandDyrepark.leggTilEtDyrIDyreparken(sjimpansenArne);
        kristiansandDyrepark.leggTilEtDyrIDyreparken(sjimpansenJulius);
        kristiansandDyrepark.leggTilEtDyrIDyreparken(pandaenTrine);
        kristiansandDyrepark.leggTilEtDyrIDyreparken(honningGrevlingenNils);


        DyrePark boraasDjurpark = new DyrePark("Boraas Djurpark");

        boraasDjurpark.leggTilEtDyrIDyreparken(new HonningGrevling("Lille Nils", LocalDate.of(2020, 1, 1)));
        boraasDjurpark.leggTilEtDyrIDyreparken(new Sjimpanse("Stian", LocalDate.of(2019, 2, 3), 80));
        boraasDjurpark.leggTilEtDyrIDyreparken(new Panda("Anna", LocalDate.of(2018, 3, 2), "Gult"));

        dyreParker.add(kristiansandDyrepark);
        dyreParker.add(boraasDjurpark);
    }

    @Override
    public ArrayList<Dyr> getAlleDyrIDyrepark(String parkNavn) {
        DyrePark aktuellDyrepark = getDyrepark(parkNavn);

        if (aktuellDyrepark != null)
            return aktuellDyrepark.getDyrIDyreParken();

        return new ArrayList<>();
    }

    @Override
    public DyrePark getDyrepark(String parkNavn) {
        for (DyrePark enDyrePark : dyreParker) {
            if (enDyrePark.getNavn().equals(parkNavn))
                return enDyrePark;
        }

        return null;
    }
}
