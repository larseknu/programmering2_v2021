package no.hiof.larseknu;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {
        ArrayList<Superhelt> superheltArrayList = new ArrayList<>();

        superheltArrayList.add(new Superhelt("Superman", "Clark Kent"));
        superheltArrayList.add(new Superhelt("Hulk", "Bruce Banner"));
        superheltArrayList.add(new Superhelt("Batman", "Bruce Wayne"));
        superheltArrayList.add(new Superhelt("Wonder Woman", "Diana Prince"));

        File kilde = new File("superheltregistrer.csv");

        skrivTilCSV(superheltArrayList, kilde);

        ArrayList<Superhelt> superHelterFraFil = lesFraCSVFil(kilde);

        System.out.println(superHelterFraFil);
    }

    private static ArrayList<Superhelt> lesFraCSVFil(File kilde) {
        ArrayList<Superhelt> returListe = new ArrayList<>();

        try (BufferedReader bufretLeser = new BufferedReader(new FileReader(kilde))) {
            String linje;

            while ((linje = bufretLeser.readLine()) != null) {
                String[] verdier = linje.split(";");

                Superhelt superhelt = new Superhelt(verdier[0], verdier[1]);

                returListe.add(superhelt);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return returListe;
    }

    private static void skrivTilCSV(ArrayList<Superhelt> superheltArrayList, File kilde)  {
        try (BufferedWriter bufretSkriver = new BufferedWriter(new FileWriter(kilde))) {

            for (Superhelt enSuperhelt : superheltArrayList) {
                bufretSkriver.write(enSuperhelt.getNavn() + ";" + enSuperhelt.getAlterEgo());

                bufretSkriver.newLine();
            }

        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
