
public class Main {

    public static void main(String [] args ) {
        Student nikolaTesla = new Student("Nikola", "Tesla", "SID13379002", "24128422222");
        nikolaTesla.printStudentInformasjon();

        Student thomasEdison = new Student("Thomas", "Edison");
        thomasEdison.printStudentInformasjon();

        Student tomStudent = new Student();
        tomStudent.printStudentInformasjon();
        tomStudent.setFornavn("Tom");
        tomStudent.printStudentInformasjon();

        Student nikolaTeslaKopi = nikolaTesla;
        nikolaTeslaKopi.printStudentInformasjon();

        nikolaTeslaKopi.setFornavn("Nikolai");
        System.out.println("Orginalen: " + nikolaTesla.getFornavn());
        System.out.println("Kopien: " + nikolaTeslaKopi.getFornavn());
    }

}
