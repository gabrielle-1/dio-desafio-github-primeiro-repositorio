public class Loan{

    public static void calculate(double value, int portion){

        double finalValue = 0;

        if(portion == 2){
            finalValue = value + (value * getRateTwoPortion());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$" + finalValue);
        }else if(portion == 3){
            finalValue = value + (value * getRateThreePortion());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$" + finalValue);
        }else{
            System.out.println("Quantidade de parcelas não aceita.");   
        }
    }

    public static double getRateTwoPortion(){
        return 0.2;
    }

    public static double getRateThreePortion(){
        return 0.3;
    }
    
    public static int getTwoPortion(){
        return 2;
    }

    public static int getThreePortion(){
        return 3;
    }

}