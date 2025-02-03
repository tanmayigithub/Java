import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the mark N
        System.out.print("Enter the mark: ");
        int N = sc.nextInt();

        // Check if the mark is valid
        if (N < 0) {
            System.out.println("Invalid");
        } else if (N > 85) {
            System.out.println("A");
        } else if (N > 75) {
            System.out.println("B");
        } else if (N > 65) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        // Close the scanner
        sc.close();
    }
}
