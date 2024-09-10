package entradadedados.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */
public class Exercicio6 {
    private static final double PI = 3.14159;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter value for A: ");
            double A = input.nextDouble();
            System.out.print("Enter value for B: ");
            double B = input.nextDouble();
            System.out.print("Enter value for C: ");
            double C = input.nextDouble();

            if (A <= 0 || B <= 0 || C <= 0) {
                System.out.println("All values must be positive.");
            } else {
                double rightTriangleArea = calculateRightTriangleArea(A, C);
                double radiusCircleArea = calculateCircleArea(C);
                double trapezeArea = calculateTrapezeArea(A, B, C);
                double squareArea = calculateSquareArea(B);
                double rectangleArea = calculateRectangleArea(A, B);

                System.out.printf("TRIANGLE: %.3f%n", rightTriangleArea);
                System.out.printf("CIRCLE: %.3f%n", radiusCircleArea);
                System.out.printf("TRAPEZE: %.3f%n", trapezeArea);
                System.out.printf("SQUARE: %.3f%n", squareArea);
                System.out.printf("RECTANGLE: %.3f%n", rectangleArea);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }

    private static double calculateRightTriangleArea(double base, double height) {
        return base * height / 2;
    }

    private static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    private static double calculateTrapezeArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }

    private static double calculateSquareArea(double side) {
        return side * side;
    }

    private static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
