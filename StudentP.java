package CIE;

public class StudentP {
    String name;
    String usn;
    int sem;

    public StudentP(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    public void display() {
        System.out.println("Name : " + name + "\nUSN : " + usn + "\nSemester : " + sem);
    }
}
