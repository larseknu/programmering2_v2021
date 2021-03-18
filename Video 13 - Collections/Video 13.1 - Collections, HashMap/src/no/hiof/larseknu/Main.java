package no.hiof.larseknu;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> maanedOversikt = new HashMap<>();

        maanedOversikt.put(1, "Januar");
        maanedOversikt.put(2, "Febru");
        maanedOversikt.put(2, "Fuar");
        maanedOversikt.put(2, "Februar");

        System.out.println(maanedOversikt);

        maanedOversikt.put(3, "Mars");
        maanedOversikt.put(4, "April");

        System.out.println(maanedOversikt);

        System.out.printf("Verdien for nøkkelen %d er %s%n", 3, maanedOversikt.get(3));

        for (Integer key : maanedOversikt.keySet()) {
            System.out.printf("%d tilsvarer måneden %s%n", key, maanedOversikt.get(key));
        }

        System.out.println("\n**********Månedsverdiene direkte***********");
        for (String value : maanedOversikt.values()) {
            System.out.println(value);
        }

        if (!maanedOversikt.containsKey(5))
            maanedOversikt.put(5, "Mai");

        System.out.println("\n**********Endelig utskrift**************");
        System.out.println(maanedOversikt);
    }
}
