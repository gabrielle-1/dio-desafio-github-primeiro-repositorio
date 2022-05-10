public class Quadrilatero{

    public static double calculateArea(double lado){
        return (lado * lado);
    }

    public static double calculateArea(double lado1, double lado2){
        return (lado * lado);
    }

    public static double calculateArea(double largerBase, double smallBase, double height){
        return ((largerBase + smallBase) * height) /2 );
    }

    public static float calculateArea(float diagonal1, float diagonal2){
        return ( (diagonal1 * diagonal2) /2 );
    }

}