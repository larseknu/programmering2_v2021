package no.hiof.larseknu;

import java.time.LocalDate;

public class NyMain {

    public static void main(String[] args) {
        Person[] skuespillere = new Person[4];

        skuespillere[0] = (new Person("Jamie", "Foxx", LocalDate.now()));
        skuespillere[1] = (new Person("Tina", "Fey", LocalDate.now()));
        skuespillere[2] = (new Person("Graham", "Norton", LocalDate.now()));
        // skuespillere[3] -> null

        for (int i = 0; i < skuespillere.length; i++) {
            System.out.println(skuespillere[i].getNavn());
        }
    }

}
