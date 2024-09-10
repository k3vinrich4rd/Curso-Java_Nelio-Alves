package entradadedados.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Fa�a um programa para ler o valor do raio de um c�rculo,
e depois mostrar o valor da �rea deste c�rculo com quatro
casas decimais conforme exemplos.
F�rmula da �rea: area = ? . raio2
Considere o valor de ? = 3.14159

*/
public class Exercicio2 {
    public static void main(String[] args) {
        final double PI_VALUE = 3.14159;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter radius value: ");
            double radiusValue = input.nextDouble();

            if (radiusValue <= 0) {
                System.out.println("Radius value must be positive.");
            } else {
                double formulaArea = PI_VALUE * Math.pow(radiusValue, 2);
                System.out.printf("A = %.4f%n", formulaArea);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
