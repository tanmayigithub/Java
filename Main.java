// Box Class
class Box {
    // Declare the width, height, and depth of the box
    double width, height, depth;

    // Constructor to initialize the box dimensions
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume of the box
    double calculateVolume() {
        // If any dimension is less than or equal to 0, return -1 to indicate invalid input
        if (width <= 0 || height <= 0 || depth <= 0) {
            return -1;
        }
        // Otherwise, calculate the volume
        return width * height * depth;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Read the width, height, and depth from input
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double depth = sc.nextDouble();

        // Create a Box object with the input dimensions
        Box box = new Box(width, height, depth);

        // Get the volume of the box
        double volume = box.calculateVolume();

        // If volume is -1, print "Invalid"
        if (volume == -1) {
            System.out.println("Invalid");
        } else {
            // Otherwise, print the calculated volume
            System.out.println(volume);
        }

        // Close the scanner
        sc.close();
    }
}
