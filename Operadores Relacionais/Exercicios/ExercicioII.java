public class ExercicioII{
    public static void main(String[] args) {
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: " + (b1 && b2)); //false
        System.out.println("b1 && b3: " + (b1 && b3)); //true

        System.out.println("b2 || b3: " + (b2 || b3)); //true
        System.out.println("b2 || b4: " + (b2 || b4)); //false

        System.out.println("b1 ^ b3" + (b1 ^ b3)); //false
        System.out.println("b4 ^ b1" + (b4 ^ b1)); //true

        System.out.println(!b1); //false
        System.out.println(!b2); //true

        //Nem sempre o resultado de um booleano é obtido apenas a partir de operandos/variáveis do tipo boolean.
        //Podemos ter expressões resultando um booleano. Veja o exemplo abaixo:

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true): " + (((i1 + i2) < (f2 - f1)) && true)); //true
        System.out.println("((i1 > i2) || (f2 < f 1)): " + ((i1 > i2) || (f2 < f 1))); //true
        
        //Má prática:

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)); //false
        
       
        //Boa prática:

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        
        //Podemos diminuir ainda mais a expressão de cima utilizando essas variáveis:
        System.out.prinln((salarioBaixo) && (muitosDependentes)); //false

        //E ainda podemos diminuir mais guardando este resultado em uma variável do tipo boolean
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio: " + recebeAuxilio ); //false

        //Agora, sempre que for necessário verificar se o usuário tem direito ao auxilio, utilizamos a variável recebeAuxilio, não precisamos mais utilizar a expressão toda.
    }
}