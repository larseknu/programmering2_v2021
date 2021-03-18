package no.hiof.larseknu;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> dyreNavnStabel = new Stack<>();

        dyreNavnStabel.push("Sjimpanse(Arne)");
        dyreNavnStabel.push("Katt(Nala)");
        dyreNavnStabel.push("Hund(Dent)");
        dyreNavnStabel.push("Panda(Amalie)");
        dyreNavnStabel.push("HonningGrevnling(Nils)");

        System.out.println(dyreNavnStabel);

        System.out.println(dyreNavnStabel.pop());

        System.out.println(dyreNavnStabel);

        System.out.println(dyreNavnStabel.peek());

        System.out.println(dyreNavnStabel);
    }
}
