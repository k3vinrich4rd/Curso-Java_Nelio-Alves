package comportamentodememoriaarrayslistas.vetores.foreach;

public class Exemplo {
    public static void main(String[] args) {
        String[] cars = new String[]{"BMW", "Range Rover", "Corola", "Corsa"};
        String[] names = new String[]{"Kevin Richard", "Ketelyn", "Vilma", "Eduardo"};
        for (String name : names) { //Leitura: Para cada objeto name fa�a
            System.out.println(name);
        }
        //Or

        System.out.println();
        for (String car : cars) {
            System.out.println(car);
        }


    }
}
