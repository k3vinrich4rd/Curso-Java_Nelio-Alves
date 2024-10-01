package estruturacondicional.exercicios.versaomelhorada;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir, calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/
public class Exercicio4 {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite a hora inicial do jogo (0-23): ");
            int horaInicial = input.nextInt();
            System.out.print("Digite a hora final do jogo (0-23): ");
            int horaFinal = input.nextInt();

            // Validação das horas inseridas
            if (horaInicial < 0 || horaInicial > 23 || horaFinal < 0 || horaFinal > 23) {
                System.out.println("Horas inválidas. Por favor, insira valores entre 0 e 23.");
                return;
            }

            // Cálculo da duração do jogo
            int duracao;
            if (horaInicial < horaFinal) {
                duracao = horaFinal - horaInicial;
            } else {
                duracao = 24 - horaInicial + horaFinal;
            }

            System.out.println("A DURAÇÃO DO JOGO É " + duracao + " HORA(S)");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira números inteiros.");
        }
    }
}