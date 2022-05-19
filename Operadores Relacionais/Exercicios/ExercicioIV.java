public class ExercicioIV{

    public int getNumberDayWeek(String dayWeek){

        int numerDayWeek=0;

        switch(dayWeek){
            case "Domingo": 
                numero = 1;
            break;
            case "Segunda": 
                numero = 2;
            break;
            case "Terça": 
                numero = 3;
            break;
            case "Quarta": 
                numero = 4;
            break;
            case "Quinta": 
                numero = 5;
            break;
            case "Sexta": 
                numero = 6;
            break;
            case "Sábado":
                numero = 7;
            break;
            default: numero = 0;
            break;
        }
        return numerDayWeek;
    }
  
    public void switchNumber(int number){
        switch(number){
            case 1: case 2:             
            case 3:
                System.out.println("Certo");
                break;
            case 4: 
                System.out.println("Errado");
                break;            
            case 5: 
                System.out.println("Talvez");
                break;            
            default: 
                System.out.println("Valor indefinido");
            break;
        }
    }
}