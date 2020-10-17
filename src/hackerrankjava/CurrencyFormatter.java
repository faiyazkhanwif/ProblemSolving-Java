package hackerrankjava;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;  

public class CurrencyFormatter {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us     = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india  = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china  = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        /* Print output */        
        System.out.println("US: "     + us.format(us));
        System.out.println("India: "  + india.format(india));
        System.out.println("China: "  + china.format(china));
        System.out.println("France: " + france.format(france));
    }
}