package estruturacondicional;

import java.util.Scanner;


public class RealOuFalso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //informe a sua idade
        System.out.print("Dite '1' ou '2': ");
        int number = input.nextInt();

        if (number != 1 && number != 2) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Digite n�mero novamente");
            int numeroNovo = input2.nextInt();
            if (numeroNovo == 1) {
                System.out.println("Voc� pega brancas");
            } else {
                System.out.println("Voc� n�o pega brancas");
            }
        } else if (number == 1) {
            System.out.println("Voc� pega brancas");
        } else {
            System.out.println("Voc� n�o pega brancas");
        }


        input.close();


    }
}
