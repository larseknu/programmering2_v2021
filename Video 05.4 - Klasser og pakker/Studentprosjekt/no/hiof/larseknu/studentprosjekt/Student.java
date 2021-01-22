package no.hiof.larseknu.studentprosjekt;

public class Student {
    private String fornavn;
    private String etternavn;
    private int alder;
    private String studentID;
    private String fodselsnummer;

    public Student() {
    }

    public Student(String fornavn, String etternavn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public Student(String fornavn, String etternavn, String studentID, String fodselsnummer) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.studentID = studentID;
        this.fodselsnummer = fodselsnummer;
    }

    public void printStudentInformasjon() {
        System.out.println(fornavn + " " + etternavn + " har ID: " + studentID);
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getStudentId() {
        return studentID;
    }

    public void setStudentId(String studentID) {
        this.studentID = studentID;
    }

    public String getFodselsnummer() {
        return fodselsnummer;
    }

}
