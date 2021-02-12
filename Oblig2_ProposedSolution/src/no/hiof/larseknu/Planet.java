package no.hiof.larseknu;

public class Planet {
    private String name;
    private double radius;
    private double mass;

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public double getSurfaceGravity() {
         // g = GM / R²
        return (6.67408E-11 * getMassInKg()) / Math.pow(getRadiusInMeter(), 2);
    }

    public double getRadiusInKm() {
        return radius * 71492;
    }

    private double getRadiusInMeter() {
        return getRadiusInKm() * 1000;
    }

    public double getMassInKg() {
        return mass * 1.898E27;
    }

    public double getMassInMearth() {
        return getMassInKg() / 5.972E24;
    }

    public double getRadiusInRearth() {
        return getRadiusInKm() / 6371;
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

    @Override
    public String toString() {
        return String.format("%s has a radius of %s Rjup and a mass of %s Mjup", name, radius, mass);
    }
}
