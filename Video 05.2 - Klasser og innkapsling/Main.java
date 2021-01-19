
public class Main {

    public static void main(String [] args ) {
        Student nyStudent = new Student();

        nyStudent.setFornavn("Nikola");
        nyStudent.setEtternavn("Tesla");
        nyStudent.setAlder(38);
        nyStudent.setStudentId("SID13379001");

        nyStudent.printStudentInformasjon();

        nyStudent.setStudentId("SID42424242");
        nyStudent.printStudentInformasjon();


        Student enNyStudent = new Student();

        enNyStudent.setFornavn("Thomas");
        enNyStudent.setEtternavn("Edison");
        enNyStudent.setAlder(45);
        enNyStudent.setStudentId("SID13379002");

        enNyStudent.printStudentInformasjon();

        System.out.println(enNyStudent.getFornavn() + " sin alder er " + enNyStudent.getAlder());

        System.out.println(enNyStudent.getFornavn() + " sitt fødselsnummer er " + enNyStudent.getFodselsnummer());
    }



}
