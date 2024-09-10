package entradadedados.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos*/
public class Exercicio1 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int firstNumber = input.nextInt();
            System.out.print("Enter second number: ");
            int secondNumber = input.nextInt();

            int resultSum = firstNumber + secondNumber;
            System.out.println("SUM = " + resultSum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
