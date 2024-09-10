package entradadedados.exercicios.versaomelhorada;

import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter code for part 1: ");
            int partCodeOne = input.nextInt();
            System.out.print("Enter number of pieces for part 1: ");
            int numberOfPiecesOne = input.nextInt();
            System.out.print("Enter unit value for part 1: ");
            double unitValueOfPartsOne = input.nextDouble();

            System.out.print("Enter code for part 2: ");
            int partCodeSecond = input.nextInt();
            System.out.print("Enter number of pieces for part 2: ");
            int numberOfPiecesSecond = input.nextInt();
            System.out.print("Enter unit value for part 2: ");
            double unitValueOfPartsSecond = input.nextDouble();

            double amountToPay = calculateAmountToPay(numberOfPiecesOne, unitValueOfPartsOne, numberOfPiecesSecond, unitValueOfPartsSecond);

            System.out.printf("Amount To Pay: R$ %.2f%n", amountToPay);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid data.");
        }
    }

    private static double calculateAmountToPay(int numberOfPiecesOne, double unitValueOfPartsOne, int numberOfPiecesSecond, double unitValueOfPartsSecond) {
        return (numberOfPiecesOne * unitValueOfPartsOne) + (numberOfPiecesSecond * unitValueOfPartsSecond);
    }
}
