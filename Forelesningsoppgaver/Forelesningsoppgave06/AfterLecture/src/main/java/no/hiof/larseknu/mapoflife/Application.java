package no.hiof.larseknu.mapoflife;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.plugin.rendering.vue.VueComponent;
import no.hiof.larseknu.mapoflife.model.Amphibian;
import no.hiof.larseknu.mapoflife.model.Invertibrate;
import no.hiof.larseknu.mapoflife.model.Observation;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Application {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start();

        app.config.enableWebjars();

        app.get("/", ctx -> ctx.redirect("/observations"));

        app.get("/observations", new VueComponent("observations-overview"));

        ArrayList<Observation> observations = generateObservations();

        Collections.sort(observations);

        // Anonym indre klasse sortering
        observations.sort(new Comparator<Observation>() {
            @Override
            public int compare(Observation observation1, Observation observation2) {
                return observation1.getId() - observation2.getId();
            }
        });

        // Sortering med lambda
        observations.sort((o1, o2)  -> o1.getId() - o2.getId());

        app.get("/api/observations", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                ctx.json(observations);
            }
        });
    }

    private static ArrayList<Observation> generateObservations() {
        Invertibrate spiderBee = new Invertibrate("SpiderBee", "Scarious Arachnidis", 10, true);
        Amphibian crocodileFrog = new Amphibian("CrocodileFrog", "Jumpus Bitus", true, 6);

        ArrayList<Observation> observations = new ArrayList<>();

        observations.add(new Observation(1000, "Flying spider!!!!", spiderBee,
                LocalDate.now(), 9001, "DANGEROUS! Don't get too close, they sting!"));

        observations.add(new Observation(1001, "Crocodile like animal", crocodileFrog, LocalDate.now(),
                8, "Watch out, they jump and bite!"));

        return observations;
    }

}
