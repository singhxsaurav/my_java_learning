import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Roundig_Of_Decimal {
    public static void main(String[] args )
    {
        double num = 2.2355524;
        System.out.format("%.4f", num);//%.4f means upto 4 decimal point of float/double data type
        System.out.println();


        DecimalFormat df = new DecimalFormat("#.###"); //for this import rounding mode and decimal format
        System.out.println(df.format(num));

    }
}
