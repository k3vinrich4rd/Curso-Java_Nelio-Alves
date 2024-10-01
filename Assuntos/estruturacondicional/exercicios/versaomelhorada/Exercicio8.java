package estruturacondicional.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o salário: ");
            double salary = input.nextDouble();
            double imposto = calculateTax(salary);

            if (imposto == 0) {
                System.out.println("Isento de imposto.");
            } else {
                System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um valor numérico válido.");
        }
    }

    // Método para calcular o imposto com base no salário
    private static double calculateTax(double salary) {
        double imposto = 0;

        if (salary <= 2000.0) {
            // Isento de imposto
            return imposto;
        } else if (salary <= 3000.0) {
            imposto = (salary - 2000.0) * 0.08;
        } else if (salary <= 4500.0) {
            imposto = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        return imposto;
    }
}