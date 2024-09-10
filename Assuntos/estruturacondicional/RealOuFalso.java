package estruturacondicional;

import java.util.Scanner;


public class RealOuFalso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //informe a sua idade
        System.out.print("Dite '1' ou '2': ");
        int number = input.nextInt();

        if (number != 1 && number != 2) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Digite número novamente");
            int numeroNovo = input2.nextInt();
            if (numeroNovo == 1) {
                System.out.println("Você pega brancas");
            } else {
                System.out.println("Você não pega brancas");
            }
        } else if (number == 1) {
            System.out.println("Você pega brancas");
        } else {
            System.out.println("Você não pega brancas");
        }


        input.close();


    }
}
