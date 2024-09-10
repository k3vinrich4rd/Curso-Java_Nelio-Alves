package entradadedados.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D
segundo a fórmula: DIFERENCA = (A * B - C * D).

*/
public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first value: ");
            int firstValue = input.nextInt();
            System.out.print("Enter second value: ");
            int secondValue = input.nextInt();
            System.out.print("Enter third value: ");
            int thirdValue = input.nextInt();
            System.out.print("Enter fourth value: ");
            int fourthValue = input.nextInt();

            if (firstValue == 0 || secondValue == 0 || thirdValue == 0 || fourthValue == 0) {
                System.out.println("Value invalid");
            } else {
                int different = (firstValue * secondValue - thirdValue * fourthValue);
                System.out.println("DIFFERENT = " + different);
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
