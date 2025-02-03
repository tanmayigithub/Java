import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read the input number
        int n = sc.nextInt();
        
        // Find the square of the number
        int square = n * n;
        
        // Convert the square to a string to extract the rightmost digits
        String squareStr = String.valueOf(square);
        
        // Find the length of the original number
        int len = String.valueOf(n).length();
        
        // Split the square into two parts
        String rightPart = squareStr.substring(squareStr.length() - len); // Right n digits
        String leftPart = squareStr.substring(0, squareStr.length() - len); // Left remaining digits
        
        // If leftPart is empty, treat it as 0
        if (leftPart.isEmpty()) {
            leftPart = "0";
        }
        
        // Convert the parts to integers
        int leftNum = Integer.parseInt(leftPart);
        int rightNum = Integer.parseInt(rightPart);
        
        // Check if the sum of left and right parts equals the original number
        if (leftNum + rightNum == n) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }

        // Close the scanner
        sc.close();
    }
}
