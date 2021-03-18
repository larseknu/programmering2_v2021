package no.hiof.larseknu.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;

public class Superhelt implements Comparable<Superhelt> {
    private String navn, alterEgo;

    public Superhelt() {
    }

    public Superhelt(String navn, String alterEgo) {
        this.navn = navn;
        this.alterEgo = alterEgo;
    }

    @JsonProperty("name")
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @JsonProperty("realName")
    public String getAlterEgo() {
        return alterEgo;
    }

    public void setAlterEgo(String alterEgo) {
        this.alterEgo = alterEgo;
    }

    @Override
    public String toString() {
        return String.format("%s har alteregoet %s", navn, alterEgo);
    }


    @Override
    public int compareTo(@NotNull Superhelt otherSuperHero) {
        return this.getNavn().compareTo(otherSuperHero.getNavn());
    }
}
