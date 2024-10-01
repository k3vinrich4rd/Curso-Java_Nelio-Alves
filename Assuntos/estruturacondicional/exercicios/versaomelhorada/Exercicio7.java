package estruturacondicional.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem Origem.
Se o ponto estiver sobre um dos eixos, escreva Eixo X ou Eixo Y, conforme for a
situa��o.
*/
public class Exercicio7 {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite a coordenada X: ");
            double x = input.nextDouble();
            System.out.print("Digite a coordenada Y: ");
            double y = input.nextDouble();

            if (x == 0.0 && y == 0.0) {
                System.out.println("Origem");
            } else if (x == 0.0) {
                System.out.println("Eixo Y");
            } else if (y == 0.0) {
                System.out.println("Eixo X");
            } else if (x > 0.0 && y > 0.0) {
                System.out.println("Q1");
            } else if (x < 0.0 && y > 0.0) {
                System.out.println("Q2");
            } else if (x < 0.0 && y < 0.0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inv�lida. Por favor, insira n�meros v�lidos.");
        }
    }
}