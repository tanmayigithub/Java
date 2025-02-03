import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Decimal {

    public static void main(String[] args) {
        double num = 1.3;

  DecimalFormat df = new DecimalFormat("#.###");// ("0.000")

        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));
    }
}