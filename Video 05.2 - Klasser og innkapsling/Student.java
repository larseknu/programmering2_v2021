
public class Student {
    private String fornavn;
    private String etternavn;
    private int alder;
    private String studentId;
    private String fodselsnummer = "0000000000";

    public void printStudentInformasjon() {
        System.out.println(fornavn + " " + etternavn
                   + " har ID: " + studentId);
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
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFodselsnummer() {
        return fodselsnummer;
    }

}
