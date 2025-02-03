import java.util.Scanner;

public class BookFair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input
        int N = sc.nextInt(); // Number of floors
        int V1 = sc.nextInt(); // Velocity on stairs
        int V2 = sc.nextInt(); // Velocity of elevator
        
        // Calculate time for stairs
        double stairsTime = (Math.sqrt(2) * N) / V1;
        
        // Calculate time for elevator
        double elevatorTime = (2.0 * N) / V2;
        
        // Compare times and print result
        if (elevatorTime < stairsTime) {
            System.out.println("Elevator");
        } else {
            System.out.println("Stairs");
        }
        
        // Close the scanner
        sc.close();
    }
}

