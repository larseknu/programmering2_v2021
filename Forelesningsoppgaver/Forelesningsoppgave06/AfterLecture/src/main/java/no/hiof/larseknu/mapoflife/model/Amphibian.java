package no.hiof.larseknu.mapoflife.model;

public class Amphibian extends Animal{
    private boolean hasLungs;
    private int numberOfLegs;

    public Amphibian(String name, String scientificName, boolean hasLungs, int numberOfLegs) {
        super(name, scientificName);
        this.hasLungs = hasLungs;
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isHasLungs() {
        return hasLungs;
    }

    public void setHasLungs(boolean hasLungs) {
        this.hasLungs = hasLungs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
