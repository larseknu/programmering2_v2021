package no.hiof.larseknu;

public class LitenTekstFormaterer implements Formaterer {
    @Override
    public String formaterTekst(String tekstSomSkalFormateres) {
        return tekstSomSkalFormateres.toLowerCase();
    }
}
