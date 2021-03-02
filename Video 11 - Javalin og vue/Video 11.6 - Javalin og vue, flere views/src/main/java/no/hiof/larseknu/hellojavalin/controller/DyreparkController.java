package no.hiof.larseknu.hellojavalin.controller;

import io.javalin.http.Context;
import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.model.DyrePark;
import no.hiof.larseknu.hellojavalin.repository.DyreparkRepository;

import java.util.ArrayList;

public class DyreparkController {
    private DyreparkRepository dyreparkRepository;

    public DyreparkController(DyreparkRepository dyreparkRepository) {
        this.dyreparkRepository = dyreparkRepository;
    }

    public void getAlleDyr(Context context) {
        String parkId = context.pathParam(":dyrepark-id");

        ArrayList<Dyr> alleDyrIDyrParken = dyreparkRepository.getAlleDyrIDyrepark(parkId);

        context.json(alleDyrIDyrParken);
    }

    public void getDyrePark(Context context) {
        String dyreParkNavn = context.pathParam(":dyrepark-id");

        DyrePark dyreParken = dyreparkRepository.getDyrepark(dyreParkNavn);

        context.json(dyreParken);
    }

    public void getDyr(Context context) {
        String dyreParkNavn = context.pathParam(":dyrepark-id");
        int dyreId = Integer.parseInt(context.pathParam("dyr-id"));

        Dyr dyr = dyreparkRepository.getDyr(dyreParkNavn, dyreId);

        context.json(dyr);
    }
}
