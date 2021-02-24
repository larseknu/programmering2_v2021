package no.hiof.larseknu;

public class StorTekstFormaterer implements Formaterer {

    @Override
    public String formaterTekst(String tekstSomSkalFormateres) {
        return tekstSomSkalFormateres.toUpperCase();
    }
}
