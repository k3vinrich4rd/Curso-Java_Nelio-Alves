package estruturacondicional.exercicios.versaomelhorada;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um n�mero inteiro: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("NEGATIVO");
            } else {
                System.out.println("N�O � NEGATIVO");
            }
        } catch (Exception e) {
            System.out.println("Entrada inv�lida. Por favor, insira um n�mero inteiro.");
        }
    }
}

