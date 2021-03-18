package no.hiof.larseknu.json;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class SuperheltAlterEgoSorter implements Comparator<Superhelt> {

    @Override
    public int compare(Superhelt s1, Superhelt s2) {
        return s1.getAlterEgo().compareTo(s2.getAlterEgo());
    }
}
