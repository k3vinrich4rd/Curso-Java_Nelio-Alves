package estruturacondicional.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "S�o M�ltiplos" ou "N�o s�o
M�ltiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente.
*/
public class Exercicio3 {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o primeiro n�mero inteiro (A): ");
            int A = input.nextInt();

            System.out.print("Digite o segundo n�mero inteiro (B): ");
            int B = input.nextInt();

            // Verifica se os n�meros s�o m�ltiplos entre si
            if (A % B == 0 || B % A == 0) {
                System.out.println("S�o M�ltiplos");
            } else {
                System.out.println("N�o s�o M�ltiplos");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inv�lida. Por favor, insira n�meros inteiros.");
        }
    }
}