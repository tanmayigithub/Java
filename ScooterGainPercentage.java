import java.util.Scanner;

public class ScooterGainPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double totalCost = A + B;
        double gain = C - totalCost;
        double gainPercentage = (gain / totalCost) * 100;

        System.out.printf("Gain percentage: %.2f\n", gainPercentage);
    }
}
