package no.hiof.larseknu;

public class Dyr {
    private String navn;
    private String art;
    private int alder;

    public Dyr(String navn, String art, int alder) {
        this.navn = navn;
        this.art = art;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
}
