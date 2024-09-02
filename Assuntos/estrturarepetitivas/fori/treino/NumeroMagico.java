package estrturarepetitivas.fori.treino;

public class NumeroMagico {
    public static void main(String[] args) {

        String input = "01";
        System.out.println(isMagicNumber(input));
    }

    public static boolean isMagicNumber(String input) {
        char[] inputToChar = input.toCharArray();
        int[] inputToInt = new int[inputToChar.length];

        int sum = 0;
        for (int i = 0; i < inputToChar.length; i++) {
            inputToInt[i] = Integer.parseInt(String.valueOf(inputToChar[i]));
            sum += inputToInt[i];
        }

        if (sum == 10 || sum == 100 || sum == 1000 || sum == 1000000000 || sum == 1) {
            System.out.println("A sequência de número(s) " + input + " é um número mágico");
            return true;

        } else {
            System.out.println("A sequência de número(s) " + input + " não é um número mágico");
            return false;
        }
    }
}







