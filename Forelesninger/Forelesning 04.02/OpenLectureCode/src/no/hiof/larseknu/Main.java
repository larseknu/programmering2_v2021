package no.hiof.larseknu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person pete = new Person("Pete", "Docter", LocalDate.of(1968, 10, 9));
        Film soul = new Film("Soul", "Animation", 123, LocalDate.of(2020, 12, 20), pete);

        pete.setFornavn("Peter");

        System.out.printf("%s har en spilletid på %d minutter og er regissert av %s %s\n",
                soul.getTittel(), soul.getSpilleTid(), soul.getRegissor().getFornavn(), soul.getRegissor().getEtternavn());

        soul.leggTilSkuespiller(new Person("Jamie", "Foxx", LocalDate.now()));
        soul.leggTilSkuespiller(new Person("Tina", "Fey", LocalDate.now()));
        soul.leggTilSkuespiller(new Person("Graham", "Norton", LocalDate.now()));

        ArrayList<Person> skuespillereISoul = soul.getSkuespillere();

        skuespillereISoul.add(new Person("Rachel", "House", LocalDate.now()));

        ArrayList<Person> nyUthentingAvSkuespillere = soul.getSkuespillere();


        System.out.println("****************Første lista*************");
        // Gjør akkurat det samme som en vanlig for-løkke, men vi får en referanse til hver person i lista direkte
        for (Person enSkuespiller : skuespillereISoul) {
            System.out.printf("%s %s er en skuespiller i %s\n",
                    enSkuespiller.getFornavn(), enSkuespiller.getEtternavn(), soul.getTittel());
        }

        System.out.println("****************Andre lista*************");
        // Gjør akkurat det samme som en vanlig for-løkke, men vi får en referanse til hver person i lista direkte
        for (Person enSkuespiller : nyUthentingAvSkuespillere) {
            System.out.printf("%s %s er en skuespiller i %s\n",
                    enSkuespiller.getFornavn(), enSkuespiller.getEtternavn(), soul.getTittel());
        }

        // Samme som for-each'en over, bare som en vanlig for-løkke
        /*for (int i = 0; i < skuespillereISoul.size(); i++) {
            Person enSkuespiller = skuespillereISoul.get(i);

            System.out.printf("%s %s er en skuespiller i %s\n",
                    enSkuespiller.getFornavn(), enSkuespiller.getEtternavn(), soul.getTittel());
        }*/
    }




}
