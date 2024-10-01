package estruturacondicional.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São Múltiplos" ou "Não são
Múltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*/
public class Exercicio3 {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número inteiro (A): ");
            int A = input.nextInt();

            System.out.print("Digite o segundo número inteiro (B): ");
            int B = input.nextInt();

            // Verifica se os números são múltiplos entre si
            if (A % B == 0 || B % A == 0) {
                System.out.println("São Múltiplos");
            } else {
                System.out.println("Não são Múltiplos");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira números inteiros.");
        }
    }
}