package no.hiof.larseknu;

public class Star {
    private String name;
    private double radius, mass, effectiveTemp;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.effectiveTemp = effectiveTemp;
    }

    public double getRadiusInKm() {
        return radius * 695700;
    }

    public double getMassInKg() {
        return mass * 1.98892E30;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    @Override
    public String toString() {
        return String.format("%s has a radius of %s Rsun, a mass of %s Msun and a effective temperature of %.0f K", name, radius, mass, effectiveTemp);
    }
}
