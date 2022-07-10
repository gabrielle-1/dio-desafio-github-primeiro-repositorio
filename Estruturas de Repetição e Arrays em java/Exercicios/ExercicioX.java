import java.util.Random;

public class ExercicioX {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                int num = random.nextInt(9);
                matriz[linha][coluna] = num;
            }
        }

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
