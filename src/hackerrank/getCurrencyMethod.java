package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;

public class getCurrencyMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextDouble();

        // US Currency Format
        NumberFormat usNumberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        // China Currency Format
        NumberFormat chinaNumberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        // France Currency Format
        NumberFormat franceNumberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // India Currency Format (with custom symbol Rs.)
        Locale india = new Locale("en", "IN");
        NumberFormat indNumberFormat = NumberFormat.getCurrencyInstance(india);
        DecimalFormatSymbols indiaSymbols = ((DecimalFormat) indNumberFormat).getDecimalFormatSymbols();
        indiaSymbols.setCurrencySymbol("Rs.");
        ((DecimalFormat) indNumberFormat).setDecimalFormatSymbols(indiaSymbols);

        // Output
        System.out.println("US: " + usNumberFormat.format(amt));
        System.out.println("India: " + indNumberFormat.format(amt));
        System.out.println("China: " + chinaNumberFormat.format(amt));
        System.out.println("France: " + franceNumberFormat.format(amt));
    }
}
