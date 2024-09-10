package entradadedados;

import java.util.Locale;

public class SeparadorUSA {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x = 3546.6577;
        System.out.println(x);
        System.out.printf("%.2f%n", x); 
        System.out.printf("%.4f%n", x);


    }
}
