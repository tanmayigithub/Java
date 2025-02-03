import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {

        int[] denominations = {100, 50, 10, 5, 2, 1};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount (N):");
        int N = sc.nextInt();

        int totalNotes = 0;

        for (int note : denominations) {
            if (N >= note) {
                int count = N / note; 
                totalNotes += count;
                N %= note; 
            }
        }

        System.out.println("Minimum number of notes required: " + totalNotes);

        sc.close();
    }
}