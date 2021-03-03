package no.hiof.larseknu.model;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, String scientificName, boolean canFly) {
        super(name, scientificName);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
