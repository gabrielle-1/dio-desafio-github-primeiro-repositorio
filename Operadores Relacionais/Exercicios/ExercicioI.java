public class ExercicioI{
    public static void main(String[] args) {
        
        System.out.println("10 == 20? " + (10 == 20)); //false
        System.out.println("10 != 20? " + (10 != 20)); //true
        System.out.println("10 > 20? " + (10 > 20)); //false
        System.out.println("10 <= 20? " + (10 <= 20)); //true

        System.out.println("4.5f == 3.5f? " + (4.5f == 3.5f)); //false
        System.out.println("4.5f != 3.5f? " + (4.5f != 3.5f)); //true
        System.out.println("4.5f >= 3.5f? " + (4.5f >= 3.5f)); //true
        System.out.println("4.5f < 3.5f? " + (4.5f < 3.5f)); //false
     
        System.out.println("char1 < char2? " + ('c' < 'd')); //é possível comparar o tamanho do char pois em seu mais baixo nível, é um código que representa uma letra

        System.out.println("59.6d != 25? " + (59.6d != 25)); //false

        //System.out.println("String1 > String2? " + ("String1" > "String2")); erro de compilação
        //System.out.println("true > false? " + (true > false)); erro de compilação
        //System.out.println("String > char? " + ("String" > 'c')); erro de compilação
        //System.out.println("String != 1? " + ("String" != 1)); erro de compilação

    }
}