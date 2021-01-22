package no.hiof.larseknu.studentprosjekt;

import com.thnatt.annenpakke.Student;

public class Main {

    public static void main(String[] args) {
        Student nyStudent = new Student("Nikola", "Tesla", "SID13379999", "25128422222");
        nyStudent.printStudentInformasjon();

        no.hiof.larseknu.studentprosjekt.Student thomasEdison = new no.hiof.larseknu.studentprosjekt.Student("Thomas", "Edison");
        thomasEdison.printStudentInformasjon();

        Student nikolaTeslaKopi = nyStudent;
        nikolaTeslaKopi.printStudentInformasjon();

        nikolaTeslaKopi.setFornavn("Nikolai");

        System.out.println("Orginal: " + nyStudent.getFornavn());
        System.out.println("Kopi: " + nikolaTeslaKopi.getFornavn());
    }

}
