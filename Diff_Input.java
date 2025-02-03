import java.util.Scanner;

public class Diff_Input {
    public static void main(String[] args) {
        String name, type;
        double expenses;
        int number;
        char entry;

        // Corrected: Class and method names should start with an uppercase letter
        // Scanner should be properly initialized
        Scanner sc = new Scanner(System.in);

        // Corrected: 'System.out.println' has a typo 'System.out.printIn'
        // Added prompts for user input
        System.out.println("Event Name:");
        name = sc.nextLine();

        System.out.println("Event Type:");
        type = sc.nextLine();

        System.out.println("Expected Count:");
        number = sc.nextInt();

        System.out.println("Paid Entry (Y/N):");
        entry = sc.next().charAt(0);

        System.out.println("Projected Expense:");
        expenses = sc.nextDouble();

        // Corrected: Proper output formatting
        System.out.println("Event Details:");
        System.out.println("Event Name : " + name);
        System.out.println("Event Type : " + type);
        System.out.println("Expected Count : " + number);
        System.out.println("Paid Entry : " + entry);
        System.out.println("Projected Expense : " + expenses + "L");

        // Close the scanner
        sc.close();
    }
}