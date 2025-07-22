package Inheritance.Assignment_4;

public class main {

    public static void main(String[] args) {
        Manager chris = new Manager(
                "Chris",
                10010,
                100000,
                1000,
                12);

        chris.displayDetails();

        Developer abhi = new Developer(
                "Abhi",
                10086,
                100000,
                "Java",
                true);

        abhi.displayDetails();
    }
}
