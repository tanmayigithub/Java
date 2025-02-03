import java.util.Scanner;

public class SquareCubeSqrt {
    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Calculate square, cube, and square root
        double square = Math.pow(num, 2);
        double cube = Math.pow(num, 3);
        double squareRoot = Math.sqrt(num);

        // Output
        System.out.printf("Square of %d is: %.1f\n", num, square);
        System.out.printf("Cube of %d is: %.1f\n", num, cube);
        System.out.printf("Square Root of %d is: %.5f\n", num, squareRoot);
    }
}
