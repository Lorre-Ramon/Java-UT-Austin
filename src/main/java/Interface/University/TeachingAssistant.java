package Interface.University;

public class TeachingAssistant implements Staff, Student{

    int noCourses;
    double salary;

    public TeachingAssistant(int noCourses, double salary) {
        this.noCourses = noCourses;
        this.salary = salary;
    }

    @Override
    public int getNoCourses() {
        return this.noCourses;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

}
