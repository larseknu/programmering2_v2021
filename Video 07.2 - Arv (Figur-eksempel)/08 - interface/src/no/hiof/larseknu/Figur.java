package no.hiof.larseknu;

public abstract class Figur  implements Tegnbar, Comparable<Figur> {
    private String farge;
    private static final double CM_TIL_METER = 100;

    public Figur() {
        farge = "Svart";
    }

    public Figur(String farge) {
        this.farge = farge;
    }

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public static double getCmTilMeter() {
        return CM_TIL_METER;
    }

    public abstract double areal();

    public abstract double omkrets();

    public double arealIMeter() {
        return areal() / CM_TIL_METER;
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

    @Override
    public int compareTo(Figur annenFigur) {
        int returverdi = (int) (this.areal() - annenFigur.areal());

        if (returverdi == 0)
            returverdi = (int) (this.omkrets() - annenFigur.omkrets());

        return returverdi;
    }
}
