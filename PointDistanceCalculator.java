import java.util.Scanner;

class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //GETTER METHODS

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint other) {
        return distance(other.x, other.y);
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.round(Math.sqrt(dx * dx + dy * dy) * 100.0) / 100.0;
    }
}

public class PointDistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        MyPoint p1 = new MyPoint(x1, y1);

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        MyPoint p2 = new MyPoint(x2, y2);

        System.out.println("The distance between (" + p1.getX() + ", " + p1.getY() + ") and (" 
                           + p2.getX() + ", " + p2.getY() + ") is: " + p1.distance(p2));

        scanner.close();
    }
}
