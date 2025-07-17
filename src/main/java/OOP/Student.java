package OOP;

public class Student {

    // attribute define
    public String name;
    public int studentId;
    double[] grades = new double[3];

    // constructor define
    public Student() {
    }

    // methods define

    public String toString() {

        // TODO: display student info
        return String.format(
                "Student Name: %s%nStudent ID: %d%nGrades: %.2f %.2f %.2f%nAverage: %.2f%nLetter Grade: %c",
                this.name, this.studentId,
                this.grades[0], this.grades[1], this.grades[2],
                calculateAverage(), getLetterGrade()
        );
    }

    public double calculateAverage() {

        double sum = -1.0;
        for (double grade : this.grades) {
            sum = sum + grade;
        }

        return sum / this.grades.length;

    }

    public char getLetterGrade() {
        // return the letter grade based on the average

        double gradeAvg = calculateAverage();

        if (gradeAvg >= 90) {
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

    public void displayStuudentInfo(double avg, char letterGrade) {
//        System.out.println("Student Name: " + this.name);
//        System.out.println("Student ID: " + this.studentId);
//
//        System.out.print("Grades: ");
//
//        for (double grade : this.grades) {
//            System.out.print(grade + " ");
//        }
//        System.out.println();
//        System.out.printf("Average: %.2f%n", avg);
//        System.out.printf("Letter Grade: %c%n", letterGrade);

        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        // create an instance
        Student student1 = new Student();
        student1.name = "Jeremey Clarkson";
        student1.studentId = 10010;
        student1.grades = new double[]{85.5, 90.0, 78.5};

        student1.displayStuudentInfo(student1.calculateAverage(), student1.getLetterGrade());
        System.out.println();

        Student student2 = new Student();
        student2.name = "James May";
        student2.studentId = 10086;
        student2.grades = new double[]{65.5, 70.0, 58.5};

        student2.displayStuudentInfo(student2.calculateAverage(), student2.getLetterGrade());
        System.out.println();

    }
}

