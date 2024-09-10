package entradadedados.exercicios;

import java.util.Locale;

public class ExercicioDeFixacao {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: \n" + product1 + "which price is $ %.2f ", price1);
        System.out.printf("\n" +product2 + " which price is $ %.2f%n ", price2);
        System.out.println("\nRecord: " + age + " years old, code " + code + " and gender: " + gender + "\n");
        System.out.println("Measure with eight decimal places: " + measure);
        System.out.printf("Rounded (three decimal places): %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.3f" ,measure);

    }
}
