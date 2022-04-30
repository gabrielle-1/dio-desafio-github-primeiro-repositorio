public class Calculator{

    public static void sum(double number1, double number2){
        double result = number1 + number2;
        System.out.println("A soma de " + number1 + " e " + number2 + " é:" + result);
    }

    public static void difference(double number1, double number2){
        double result = number1 - number2;
        System.out.println("A subtração de " + number1 + " por " + number2 + " é:" + result);
    }

    public static void product(double number1, double number2){
        double result = number1 * number2;
        System.out.println("A multiplicação de " + number1 + " e " + number2 + " é:" + result);
    }

    public static void quotient(double number1, double number2){
        double result = number1 / number2;
        System.out.println("A divisão de " + number1 + " e " + number2 + " é:" + result);
    }

}