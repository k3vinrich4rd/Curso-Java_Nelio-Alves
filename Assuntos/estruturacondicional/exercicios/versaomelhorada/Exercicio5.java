package estruturacondicional.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o c�digo do item (1-5): ");
            int itemCode = input.nextInt();

            // Valida��o do c�digo do item
            if (itemCode < 1 || itemCode > 5) {
                System.out.println("C�digo do item inv�lido. Por favor, insira um c�digo entre 1 e 5.");
                return;
            }

            System.out.print("Digite a quantidade do item: ");
            int quantidade = input.nextInt();

            // Valida��o da quantidade
            if (quantidade <= 0) {
                System.out.println("Quantidade inv�lida. Por favor, insira um valor maior que 0.");
                return;
            }

            double total = calculateTotal(itemCode, quantidade);

            System.out.printf("Total: R$ %.2f%n", total);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inv�lida. Por favor, insira valores num�ricos.");
        }
    }

    // M�todo para calcular o total com base no c�digo do item e na quantidade
    private static double calculateTotal(int itemCode, int quantidade) {
        double price = 0;

        switch (itemCode) {
            case 1:
                price = 4.00;
                break;
            case 2:
                price = 4.50;
                break;
            case 3:
                price = 5.00;
                break;
            case 4:
                price = 2.00;
                break;
            case 5:
                price = 1.50;
                break;
        }

        return quantidade * price;
    }
}