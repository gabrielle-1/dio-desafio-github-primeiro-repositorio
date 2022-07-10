import java.util.Scanner;

public class ExercicioIV {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int qtd, cont = 0, numero = 0, qtdPar = 0, qtdImpar = 0;

        System.out.println("Digite a quantidade de números: ");
        qtd = scan.nextInt();

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                qtdPar++;
            else
                qtdImpar++;

            cont++;
        } while (cont < qtd);

        System.out.println("Quantidade Par:" + qtdPar);
        System.out.println("Quantidade Ímpar:" + qtdImpar);
    }
}
