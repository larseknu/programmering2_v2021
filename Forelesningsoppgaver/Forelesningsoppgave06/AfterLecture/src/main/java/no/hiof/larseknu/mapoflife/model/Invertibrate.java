package no.hiof.larseknu.mapoflife.model;

public class Invertibrate extends Animal {
    private int numberOfLegs;
    private boolean canFly;

    public Invertibrate (String name, String scientificName, int numberOfLegs, boolean canFly) {
        super(name, scientificName);
        this.numberOfLegs = numberOfLegs;
        this.canFly = canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
