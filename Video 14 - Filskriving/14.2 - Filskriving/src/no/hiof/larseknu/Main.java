package no.hiof.larseknu;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        String lestTekst = "";
        System.out.println("Skriv tekst ('avslutt' for å avslutte)");

        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                FileWriter filSkriver = new FileWriter("novelle.txt", true)
        ) {
            while (!lestTekst.equals("avslutt")) {
                System.out.print(": ");

                lestTekst = bufferedReader.readLine();

                filSkriver.write(lestTekst + "\n");
            }
        }
        catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }

	}
}
