package no.hiof.larseknu.mapoflife;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.plugin.rendering.vue.VueComponent;
import no.hiof.larseknu.mapoflife.model.Invertibrate;
import no.hiof.larseknu.mapoflife.model.Observation;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start();

        app.config.enableWebjars();

        app.get("/", new VueComponent("observations-overview"));

        ArrayList<Observation> observations = createObservations();

        app.get("/api/observations", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                ctx.json(observations);
            }
        });
    }

    private static ArrayList<Observation> createObservations() {
        Invertibrate spiderBee = new Invertibrate("SpiderBee", "Scarious Arachnidis", 10, true);
        Invertibrate beeSpider = new Invertibrate("BeeSpider", "Scarious Flybeecus", 6, true);

        //System.out.println(spiderBee.getName() + " has " + spiderBee.getNumberOfLegs() + " legs");

        ArrayList<Observation> observations = new ArrayList<>();

        observations.add(new Observation(1000, "Flying spider!!!!", spiderBee,
                LocalDate.now(), 9001, "DANGEROUS! Don't get too close, they sting!"));

        observations.add(new Observation(1001, "They throw webs while flying!!!!", beeSpider,
                LocalDate.now(), 9002, "They crawl like a spider and sting like a bee"));


        return observations;
    }

}
