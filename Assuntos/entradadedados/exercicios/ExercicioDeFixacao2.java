package entradadedados.exercicios;

import java.util.Locale;

public class ExercicioDeFixacao2 {
    public static void main(String[] args) {
        // Configura a localidade para US
        Locale.setDefault(Locale.US);

        // Declaração de variáveis
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // Construção das strings formatadas
        String productInfo1 = String.format("Products:\n%s which price is $ %.2f", product1, price1);
        String productInfo2 = String.format("\n%s which price is $ %.2f%n", product2, price2);
        String recordInfo = String.format("\nRecord: %d years old, code %d and gender: %c\n", age, code, gender);
        String measureInfo = String.format("Measure with eight decimal places: %.8f", measure);
        String roundedMeasure = String.format("Rounded (three decimal places): %.3f", measure);
        String usDecimalPoint = String.format("\nUS decimal point: %.3f", measure);

        // Impressão das informações
        System.out.print(productInfo1);
        System.out.print(productInfo2);
        System.out.print(recordInfo);
        System.out.println(measureInfo);
        System.out.println(roundedMeasure);
        System.out.println(usDecimalPoint);
    }

}

