public class Quadrilatero{

    public static void calculateArea(double lado){
        System.out.println("A área do quadrado é:" + lado * lado);
    }

    public static void calculateArea(double lado1, double lado2){
        System.out.println("A área do triângulo é:" + lado * lado);
    }

    public static void calculateArea(double largerBase, double smallBase, double height){
        System.out.println("A área do trapézio é:" + ((largerBase + smallBase) * height) /2 );
    }

    public static void calculateArea(float diagonal1, float diagonal2){
        System.out.println("A área do losango é:" + (diagonal1 * diagonal2) /2 );
    }

}