public class ExercicioVII {
    public static void main(String[] args) {

        int[] vetor = { 0, 2, 4, 1, -6, 2 };
        int cont = 0;

        System.out.println("\nVetor original:");
        while (cont <= vetor.length - 1) {
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.println("\nVetor inverso:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}
