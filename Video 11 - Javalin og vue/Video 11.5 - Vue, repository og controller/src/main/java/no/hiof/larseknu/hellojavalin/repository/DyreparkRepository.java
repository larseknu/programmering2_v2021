package no.hiof.larseknu.hellojavalin.repository;

import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.model.DyrePark;

import java.util.ArrayList;

public interface DyreparkRepository {
    ArrayList<Dyr> getAlleDyrIDyrepark(String parkNavn);
    DyrePark getDyrepark(String parkNavn);
}
