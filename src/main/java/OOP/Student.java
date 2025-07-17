package OOP;

public class Student {

    /**
     * The {@code Student} class represents a student with attributes such as name, student ID, and grades.
     */

    // attribute define
    public String name;
    public int studentId;
    double[] grades = new double[3];

    // constructor define
    public Student() {
    }

    // methods define

    /**
     * Override the toString() method to return a formatted string representation of the Student object.
     * @return A formatted string containing the student's name, ID, grades, average, and letter grade.
     */
    public String toString() {

        return String.format(
                "Student Name: %s%nStudent ID: %d%nGrades: %.2f %.2f %.2f%nAverage: %.2f%nLetter Grade: %c",
                this.name, this.studentId,
                this.grades[0], this.grades[1], this.grades[2],
                calculateAverage(), getLetterGrade()
        );
    }

    /**
     * Calculate the average of the grades.
     * @return The average of the grades.
     */
    public double calculateAverage() {

        double sum = -1.0;
        for (double grade : this.grades) {
            sum = sum + grade;
        }

        return sum / this.grades.length;

    }

    /**
     * Change the grades of the student.
     * @param newGrades An array of new grades to replace the current grades.
     */
    public void changeGrade(double[] newGrades) {
        this.grades = newGrades;
    }

    /**
     * Change a specific grade of the student at the given index.
     * @param newGrade The new grade to set.
     * @param index The index of the grade to change (0, 1, or 2).
     */
    public void changeGrade(double newGrade, int index) {
        try {
            this.grades[index] = newGrade;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds. Please provide a valid index (0, 1, or 2).");
        }
    }

    /**
     * Determine the letter grade based on the average.
     * @return The letter grade ('A', 'B', 'C', 'D', or 'F').
     */

    public char getLetterGrade() {
        // return the letter grade based on the average

        double gradeAvg = calculateAverage();

        if (gradeAvg >= 90 && gradeAvg <= 100) {
            return 'A';
        } else if (gradeAvg >= 80 && gradeAvg < 90) {
            return 'B';
        } else if (gradeAvg >= 70 && gradeAvg < 80) {
            return 'C';
        } else if (gradeAvg >= 60 && gradeAvg < 70) {
            return 'D';
        } else {
            return 'F';
        }

    }

    /**
     * Display the student's information, including name, ID, grades, average, and letter grade.
     */
    public void displayStuudentInfo() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        // create an instance
        Student student1 = new Student();
        student1.name = "Jeremey Clarkson";
        student1.studentId = 10010;
        student1.grades = new double[]{85.5, 90.0, 78.5};

        student1.displayStuudentInfo();
        System.out.println();

        Student student2 = new Student();
        student2.name = "James May";
        student2.studentId = 10086;
        student2.grades = new double[]{65.5, 70.0, 58.5};

        student2.displayStuudentInfo();
        System.out.println();

    }
}

