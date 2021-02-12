package no.hiof.larseknu;

public class Main {

    public static void main(String[] args) {
        Star sun = new Star("Sun", 1.0, 1.0, 5777);

	    PlanetSystem solarSystem = new PlanetSystem("Solar System", sun);

	    Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
	    solarSystem.addPlanet(mercury);
	    solarSystem.addPlanet(new Planet("Venus", 0.08465003077267387, 0.002564278187565859));
        solarSystem.addPlanet(new Planet("Earth", 0.08911486599899289, 0.003146469968387777));
        solarSystem.addPlanet(new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4));
        solarSystem.addPlanet(new Planet("Jupiter",1.0, 1.0));
        solarSystem.addPlanet(new Planet("Saturn", 0.8145247020645666, 0.2994204425711275));
        solarSystem.addPlanet(new Planet("Uranus", 0.35475297935433336, 0.04573761854583773));
        solarSystem.addPlanet(new Planet("Neptune",0.34440217087226543, 0.05395152792413066));

        System.out.println(solarSystem.toString());

        Planet venus = solarSystem.getPlanets().get(1);
        Planet earth = solarSystem.getPlanets().get(2);
        Planet mars = solarSystem.getPlanets().get(3);
        Planet jupiter = solarSystem.getPlanets().get(4);
        Planet saturn = solarSystem.getPlanets().get(5);
        Planet uranus = solarSystem.getPlanets().get(5);
        Planet neptune = solarSystem.getPlanets().get(7);

        System.out.println(sun.toString());
        System.out.println(venus);
        System.out.printf("%s has a radius of %skm and a mass of %skg %n",
                venus.getName(), venus.getRadiusInKm(), venus.getMassInKg());
        System.out.printf("%s has a radius of %skm and a mass of %skg %n",
                saturn.getName(), saturn.getRadiusInKm(), saturn.getMassInKg());

        System.out.printf("%s has a radius of %skm and a mass of %skg %n",
                sun.getName(), sun.getRadiusInKm(), sun.getMassInKg());

        System.out.printf("%s has a radius of %s Rearth and a mass of %s Mearth %n",
                mars.getName(), mars.getRadiusInRearth(), mars.getMassInMearth());

        System.out.println("Staurn gravity " + saturn.getSurfaceGravity() + " m/s²");
        System.out.println("Neptune gravity " + neptune.getSurfaceGravity() + " m/s²");

        System.out.println("Smallest: " + solarSystem.getSmallestPlanet());
        System.out.println("Largest: " + solarSystem.getLargestPlanet());
    }
}
