package no.hiof.larseknu.hellojavalin.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

@JsonTypeInfo(include= JsonTypeInfo.As.EXTERNAL_PROPERTY, use= JsonTypeInfo.Id.NAME, property="art")
public class Dyr {
    private final int ID;
    private String navn;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate fodselsDato;
    private static int dyreTeller;

    public Dyr(String navn, LocalDate fodselsDato) {
        this.ID = 1000 + dyreTeller++;
        this.navn = navn;
        this.fodselsDato = fodselsDato;
    }

    public final int getID() {
        return ID;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public LocalDate getFodselsDato() {
        return fodselsDato;
    }

    public void setFodselsDato(LocalDate fodselsDato) {
        this.fodselsDato = fodselsDato;
    }

    @Override
    public String toString() {
        return  getID() + " - " + navn;
    }
}
