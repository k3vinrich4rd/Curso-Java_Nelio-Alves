package estruturacondicional.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o código do item (1-5): ");
            int itemCode = input.nextInt();

            // Validação do código do item
            if (itemCode < 1 || itemCode > 5) {
                System.out.println("Código do item inválido. Por favor, insira um código entre 1 e 5.");
                return;
            }

            System.out.print("Digite a quantidade do item: ");
            int quantidade = input.nextInt();

            // Validação da quantidade
            if (quantidade <= 0) {
                System.out.println("Quantidade inválida. Por favor, insira um valor maior que 0.");
                return;
            }

            double total = calculateTotal(itemCode, quantidade);

            System.out.printf("Total: R$ %.2f%n", total);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira valores numéricos.");
        }
    }

    // Método para calcular o total com base no código do item e na quantidade
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