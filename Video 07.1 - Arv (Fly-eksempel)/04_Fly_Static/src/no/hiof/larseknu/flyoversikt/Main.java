package no.hiof.larseknu.flyoversikt;

public class Main {

    public static void main(String[] args) {
        Fly boeing737 = new Fly("Boeing-737", 200);
        Transportfly c141a = new Transportfly("C-141A", 15, 155000);

        boeing737.leggTilEnPassasjer();
        boeing737.leggTilEnPassasjer();

        System.out.println("Totalt antall passasjerer: " + Fly.getTotaltAntallPassasjerer());

        c141a.leggTilEnPassasjer();
        c141a.leggTilEnPassasjer();

        boeing737.leggTilEnPassasjer();
        boeing737.leggTilEnPassasjer();
        boeing737.leggTilEnPassasjer();

        System.out.println("Totalt antall passasjerer: " + Fly.getTotaltAntallPassasjerer());
    }
}
