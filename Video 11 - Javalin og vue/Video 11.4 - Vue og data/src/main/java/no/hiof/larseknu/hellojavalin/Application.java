package no.hiof.larseknu.hellojavalin;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.plugin.rendering.vue.VueComponent;
import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.model.HonningGrevling;
import no.hiof.larseknu.hellojavalin.model.Sjimpanse;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start();

        app.config.enableWebjars();

        app.get("/", new VueComponent("hello-world"));
        app.get("/dyrepark/:dyrepark-id", new VueComponent("dyrepark-detail"));

        app.get("/api/dyrepark/:dyrepark-id", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                ArrayList<Dyr> dyreListe = new ArrayList<Dyr>();
                dyreListe.add(new Sjimpanse("Arne", LocalDate.of(2016, 4, 4), 60));
                dyreListe.add(new Sjimpanse("Idun", LocalDate.of(2016, 4, 4), 80));
                dyreListe.add(new HonningGrevling("Nils", LocalDate.now()));

                ctx.json(dyreListe);
            }
        });
    }

}
