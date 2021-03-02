package no.hiof.larseknu.hellojavalin;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.plugin.rendering.vue.VueComponent;
import no.hiof.larseknu.hellojavalin.controller.DyreparkController;
import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.model.HonningGrevling;
import no.hiof.larseknu.hellojavalin.model.Sjimpanse;
import no.hiof.larseknu.hellojavalin.repository.DyreparkDataRepository;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start();

        app.config.enableWebjars();

        app.get("/", new VueComponent("hello-world"));
        app.get("/dyrepark/:dyrepark-id", new VueComponent("dyrepark-detail"));
        app.get("/dyrepark/:dyrepark-id/dyr/:dyr-id", new VueComponent("dyr-detail"));

        DyreparkDataRepository dyreparkRepository = new DyreparkDataRepository();
        DyreparkController dyreparkController = new DyreparkController(dyreparkRepository);

        app.get("/api/dyrepark/:dyrepark-id", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                dyreparkController.getDyrePark(ctx);
            }
        });

        app.get("/api/dyrepark/:dyrepark-id/dyr/:dyr-id", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                dyreparkController.getDyr(ctx);
            }
        });
    }

}
