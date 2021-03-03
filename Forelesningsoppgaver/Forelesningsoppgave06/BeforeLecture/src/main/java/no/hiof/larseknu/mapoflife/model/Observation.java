package no.hiof.larseknu.mapoflife.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

public class Observation {
    private final int id;
    private String name;
    private Animal observedAnimal;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate date;
    private int numberOfAnimals;
    private String description;

    public Observation(int id, String name, Animal observedAnimal, LocalDate date, int numberOfAnimals, String description) {
        this.id = id;
        this.name = name;
        this.observedAnimal = observedAnimal;
        this.date = date;
        this.numberOfAnimals = numberOfAnimals;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getObservedAnimal() {
        return observedAnimal;
    }

    public void setObservedAnimal(Animal observedAnimal) {
        this.observedAnimal = observedAnimal;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
