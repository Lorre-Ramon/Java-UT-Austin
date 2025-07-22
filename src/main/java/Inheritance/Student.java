package Inheritance;

/**
 * The @Student class represents.
 */
public class Student {

    String name;
    int studentID;
    int noCourses;

    // Constructor
    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.noCourses = 0;
    }

    @Override
    public String toString() {
        return String.format("I'm a student named %s with ID %d, enrolled in %d courses.",
                             this.name, this.studentID, this.noCourses);
    }

    public int getNoCourses() {
        return this.noCourses;
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 12345);
        System.out.println(student.toString());

    }
}
