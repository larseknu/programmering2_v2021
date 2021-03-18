package no.hiof.larseknu.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Superhelt superman = new Superhelt("Superman", "Clark Kent");

        try {
            // KONVERTERING TIL OG FRA JSON
            String jsonText = objectMapper.writeValueAsString(superman);
            System.out.println(jsonText);
            Superhelt supermanKopi = objectMapper.readValue(jsonText, Superhelt.class);
            System.out.println(supermanKopi);

            // OPPRETTELSE AV LISTE
            ArrayList<Superhelt> superhelter = new ArrayList<>();
            superhelter.add(superman);
            superhelter.add(new Superhelt("Batman", "Bruce Wayne"));
            superhelter.add(new Superhelt("Wonder Woman", "Diana Prince"));
            superhelter.add(new Superhelt("Hulk", "Bruce Banner"));


            // SORTERING
            Collections.sort(superhelter);
            SuperheltAlterEgoSorter superheltAlterEgoSorter = new SuperheltAlterEgoSorter();
            superhelter.sort(superheltAlterEgoSorter);
            superhelter.sort(new Comparator<Superhelt>() {
                @Override
                public int compare(Superhelt s1, Superhelt s2) {
                    return s1.getAlterEgo().compareTo(s2.getAlterEgo());
                }
            });


            // SKRIVE OG LESE JSON TIL/FRA FIL
            skrivTilJSONFil(superhelter, "superhelter.json");

            ArrayList<Superhelt> superhelterLestFraFil = lesFraJSonFil("superhelter.json");

            System.out.println("\n\n*****************Konvertert fra JSON***********************");
            System.out.println(superhelterLestFraFil);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void skrivTilJSONFil(ArrayList<Superhelt> superhelter, String filsti) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filsti), superhelter);
    }

    private static ArrayList<Superhelt> lesFraJSonFil(String filnavn) {
        ArrayList<Superhelt> superheltReturListe = new ArrayList<>();

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Superhelt[] superheltArray = objectMapper.readValue(new File(filnavn), Superhelt[].class);

            superheltReturListe.addAll(Arrays.asList(superheltArray));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


        return superheltReturListe;
    }

}
