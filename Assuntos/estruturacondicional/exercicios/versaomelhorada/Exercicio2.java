package estruturacondicional.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {/*
Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
 */

    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um n�mero inteiro: ");
            int numero = input.nextInt();

            if (numero % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("�MPAR");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inv�lida. Por favor, insira um n�mero inteiro.");
        }
    }
}
