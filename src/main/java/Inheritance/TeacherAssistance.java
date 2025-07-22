package Inheritance;

public class TeacherAssistance extends Student{

    double salaryPerHour;
    int workingHours;

    // Constructor
    public TeacherAssistance(String name, int studentID, double salaryPerHour, int workingHours) {
        super(name, studentID);
        this.salaryPerHour = salaryPerHour;
        this.workingHours = workingHours;
    }

    public double getSalaryPerWeek() {
        return this.salaryPerHour * this.workingHours;
    }

    public int getOverallHours() {
        return super.getNoCourses() * 2 + this.workingHours; // super a method from Student class
    }

    public static void main(String[] args) {
        TeacherAssistance Benji = new TeacherAssistance("Benji", 67890, 15.0, 20);
    }

}
