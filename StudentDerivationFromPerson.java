public class StudentDerivationFromPerson {
    public static void main(String[] args) {
        Student courseStudent = new Student();

        courseStudent.setName("Smith");
        courseStudent.setAge(20);
        courseStudent.setID(9999);
        courseStudent.printAll();
        System.out.print(", ID: " + courseStudent.getID());
    }
}