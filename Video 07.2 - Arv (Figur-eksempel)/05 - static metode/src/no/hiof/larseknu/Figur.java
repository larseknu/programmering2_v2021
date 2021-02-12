package no.hiof.larseknu;

public class Figur {

    public double areal() {
        return 0;
    }

    public double omkrets() {
        return 0;
    }

    public static boolean erStorreStatic(Figur figur1, Figur figur2) {
        return figur1.areal() > figur2.areal();
    }

    public boolean erStorre(Figur sammenligningsFigur) {
        return this.areal() > sammenligningsFigur.areal();
    }

}
