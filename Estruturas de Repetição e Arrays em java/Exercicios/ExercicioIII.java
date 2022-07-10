import java.util.Scanner;

public class ExercicioIII {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, maior = 0, soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero > maior)
                maior = numero;

            soma += numero;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + (soma / 5));

    }
}
