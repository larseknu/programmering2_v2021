
public class Main {

    public static void main(String [] args ) {
        Student nyStudent = new Student();

        nyStudent.fornavn = "Nikola";
        nyStudent.etternavn = "Tesla";
        nyStudent.alder = 38;
        nyStudent.studentID = "SID13379001";

        nyStudent.printStudentInformasjon();

        nyStudent.studentID = "SID42424242";
        nyStudent.printStudentInformasjon();


        Student enNyStudent = new Student();

        enNyStudent.fornavn = "Thomas";
        enNyStudent.etternavn = "Edison";
        enNyStudent.alder = 45;
        enNyStudent.studentID = "SID13379002";

        enNyStudent.printStudentInformasjon();
    }

}
