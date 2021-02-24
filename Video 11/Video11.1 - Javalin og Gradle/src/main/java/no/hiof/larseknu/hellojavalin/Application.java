package no.hiof.larseknu.hellojavalin;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class Application {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start();

        app.get("/", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                ctx.result("Hello javalin!");
            }
        });

        app.get("/another-side", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                ctx.result("Hello from the other side!");
            }
        });
    }

}