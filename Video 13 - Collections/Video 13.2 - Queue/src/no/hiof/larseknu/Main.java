package no.hiof.larseknu;

import java.lang.reflect.Array;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
        Queue<String> dyreMatKo = new ArrayBlockingQueue<>(4);

        // Kaster exception
        //System.out.println(dyreMatKo.remove());
        // Gir oss null-objekt tilbake
        //System.out.println(dyreMatKo.poll());

        dyreMatKo.offer("Sjimpanse(Arne)");
        dyreMatKo.offer("Katt(Misti)");
        dyreMatKo.offer("HonningGrevling(Nils)");
        System.out.println(dyreMatKo.offer("Panda(Amalie)"));
        // Returnerer true / false
        System.out.println(dyreMatKo.offer("Hund(Dent)"));
        // Kaster exception
        //System.out.println(dyreMatKo.add("Hund(Dent)"));

        System.out.println(dyreMatKo);

        System.out.println("Poll: "  + dyreMatKo.poll());
        System.out.println("Remove: " + dyreMatKo.remove());

        System.out.println(dyreMatKo);

        System.out.println("Peek: " + dyreMatKo.peek());

        System.out.println(dyreMatKo);
    }
}
