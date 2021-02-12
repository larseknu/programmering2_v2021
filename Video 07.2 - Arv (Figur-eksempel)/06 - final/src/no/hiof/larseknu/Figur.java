package no.hiof.larseknu;

public class Figur {
    private static final double CM_TIL_METER = 100;

    public double areal() {
        return 0;
    }

    public double arealIMeter() {
        return areal() / CM_TIL_METER;
    }

    public double omkrets() {
        return 0;
    }

    public double omkretsIMeter() {
        return omkrets() / CM_TIL_METER;
    }

    public static boolean erStorreStatic(Figur figur1, Figur figur2) {
        return figur1.areal() > figur2.areal();
    }

    public boolean erStorre(Figur sammenligningsFigur) {
        return this.areal() > sammenligningsFigur.areal();
    }

}
