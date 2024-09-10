package entradadedados.exercicios.versaomelhorada;

import java.util.Scanner;

/*
Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
decimais.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter employee number: ");
            int employeeNumber = input.nextInt();

            System.out.print("Enter hours worked: ");
            int hoursWorked = input.nextInt();

            System.out.print("Enter hourly rate: ");
            double hourValue = input.nextDouble();

            double salary = calculateSalary(hoursWorked, hourValue);

            System.out.println("NUMBER EMPLOYEE = " + employeeNumber);
            System.out.printf("SALARY = U$ %.2f%n", salary);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid data.");
        }
    }

    private static double calculateSalary(int hoursWorked, double hourValue) {
        return hoursWorked * hourValue;
    }

}

