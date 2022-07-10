import java.util.Scanner;

public class ExercicioVI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial, resultado = 1;

        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        System.out.println(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            resultado += resultado * i;
        }

        System.out.println(resultado);

    }
}
