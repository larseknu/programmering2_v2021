package no.hiof.larseknu.mapoflife;

import no.hiof.larseknu.mapoflife.model.Invertibrate;
import no.hiof.larseknu.mapoflife.model.Observation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Invertibrate spiderBee = new Invertibrate("SpiderBee", "Scarious Arachnidis", 10, true);

        System.out.println(spiderBee.getName() + " has " + spiderBee.getNumberOfLegs() + " legs");

        Observation spiderBeeObserved = new Observation(1000, "Flying spider!!!!", spiderBee,
                LocalDate.now(), 9001, "DANGEROUS! Don't get too close, they sting!");

        System.out.println(spiderBeeObserved.getObservedAnimal().getName() + " - " + spiderBeeObserved.getDescription());
    }
}
