package no.hiof.larseknu;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Superhero> apex = new ArrayList<>();
        apex.add(new Superhero("Bangalore", "Anita Williams", 35));
        apex.add(new Superhero("Lifeline", "Ajay Che", 24));
        apex.add(new Superhero("Gibraltar", "Makao Gibralter", 30));
        apex.add(new Superhero("Caustic", "Alexander Nox", 48));
        apex.add(new Superhero("Bloodhound", "Unknown"));
        apex.add(new Superhero("Mirage", "Elliott Witt", 30));
        apex.add(new Superhero("Octane", "Octavio Silva", 24));
        apex.add(new Superhero("Pathfinder", "MRVN"));
        apex.add(new Superhero("Wraith", "Renee Blasey", 32));
        apex.add(new Superhero("Crypto", "Tae Joon Park", 31));
        apex.add(new Superhero("Wattson", "Natalie Paquette", 22));
        apex.add(new Superhero("Revenant", "Unknown", 288));
        apex.add(new Superhero("Loba", "Loba Andrade", 34));
        apex.add(new Superhero("Rampart", "Ramya Parekh", 21));
        apex.add(new Superhero("Horizon", "Dr. Mary Somers", 37));
        apex.add(new Superhero("Fuse", "Walter Fitzroy", 54));

        System.out.println(apex);

        Collections.sort(apex);

        System.out.println("\n***************ALL***********************");
        //printConditionally(apex, aSuperhero -> true);
        performConditionally(apex, s -> true, s -> System.out.println(s));

        performConditionally(apex,
                s -> s.getAge() > 29,
                s -> {
                    int currentAge = s.getAge();
                    s.setAge(currentAge+1);
                });

        apex.sort((superhero1, superhero2) -> superhero1.getAge() - superhero2.getAge());

        System.out.println("\n***************Starts with B***********************");
        printConditionally(apex, aSuperhero -> aSuperhero.getName().startsWith("B"));

        System.out.println("\n***************Age over 30***********************");
        //printConditionally(apex, aSuperhero -> aSuperhero.getAge() > 30);
        performConditionally(apex, s -> s.getAge() > 30, s -> System.out.println(s));
    }

    public static void printConditionally(List<Superhero> superheroes, Condition condition) {
        for (Superhero aSuperhero : superheroes) {
            // Gjør en eller annen form for filtrering ved hjelp av condition sin testmetode
            if (condition.test(aSuperhero))
                System.out.println(aSuperhero);
        }
    }

    public static void performConditionally(List<Superhero> superheroes, Condition condition, Action action) {
        for (Superhero aSuperhero : superheroes) {
            // Gjør en eller annen form for filtrering ved hjelp av condition sin testmetode
            if (condition.test(aSuperhero))
                action.perform(aSuperhero);
        }
    }
}

interface Condition {
    boolean test(Superhero aSuperhero);
}

interface Action {
    void perform(Superhero aSuperhero);
}

