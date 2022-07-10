import java.util.Random;

public class ExercicioIX {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int num = random.nextInt(100);
            numerosAleatorios[i] = num;
        }

        System.out.println("\nNúmeros aleatórios:");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos números aleatórios:");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.println("\nAntecessores dos números aleatórios:");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }
    }
}
