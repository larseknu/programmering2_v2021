package no.hiof.larseknu;

import no.hiof.larseknu.model.Student;

public class Main {

    public static void main(String[] args) {
        Student enStudent = new Student("Ola Nordmann", 29);

        System.out.println(enStudent.toString());

        System.out.println("Hello, World!");
    }
}
