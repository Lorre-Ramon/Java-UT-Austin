package Inheritance.Assignment_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Coffee userCoffee = null;
        boolean ordering = true;

        System.out.println("Welcome to the Jester Java Coffee Shop!");

        // TODO: try make this a infinite loop until user enters 'q' to quit
        // TODO: Try make this a loop so user can order multiple coffees

        while (ordering) {

            System.out.println("Please select a coffee type:");
            System.out.printf("1. Espresso%n2. Latte%n");
//            System.out.println("Enter q to quit.");
            System.out.println("Your choice: (1/2) ");

            String choice = scnr.nextLine();

            switch (choice) {
                case "1":
                    userCoffee = new Espresso();
                    ordering = false;
                    break;
                case "2":
                    userCoffee = new Latte();
                    ordering = false;
                    break;
                case "q":
                    System.out.println("Thank you for visiting Jester Java Coffee Shop!");
                    scnr.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("You selected: " + userCoffee.name);

        System.out.println("Please select a size (tall/grande/venti): ");
        userCoffee.setSize(scnr.nextLine());

        System.out.println("Would you like it iced? (Y/n): ");
        userCoffee.setIced(scnr.nextLine());

        System.out.println("How many espresso shots would you like? (1-3): ");
        userCoffee.setShots(scnr.nextInt());

        while (true) {
            System.out.println("Would you like a condiment (milk/sugar/n)? ");
            String userCondiment = scnr.nextLine();

            if (userCondiment.equals("n")) {
                break;
            } else {
                userCoffee.addCondiment(userCondiment);
            }
        }

        userCoffee.brew();
        userCoffee.printPrice();
        userCoffee.serve();

    }
}
