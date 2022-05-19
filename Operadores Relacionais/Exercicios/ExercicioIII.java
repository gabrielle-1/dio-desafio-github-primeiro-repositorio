public class ExercicioIII{
    public static void main(String[] args) {
     
        int number = 2;
        String nameMounth = switchMounth(number);

        switch(nameMounth){
            case "July":
            case "December":
            case "January":
                System.out.println("Férias!");  
            break;
            default:
                System.out.println("Mês indefinido!");
                break;
        }
               
    }

    public String switchMounth(int number){
        String nameMounth = "";

        switch (number) {
            case 1:
                nameMounth = "January";        
                break;        
            case 2:
                nameMounth = "February";        
                break;        
            case 3:
                nameMounth = "March";        
                break;        
            case 4:
                nameMounth = "April";        
                break;        
            case 5:
                nameMounth = "May";        
                break;        
            case 6:
                nameMounth = "June";        
                break;        
            case 7:
                nameMounth = "July";        
                break;        
            case 8:
                nameMounth = "August";        
                break;        
            case 9:
                nameMounth = "September";        
                break;        
            case 10:
                nameMounth = "October";        
                break;        
            case 11:
                nameMounth = "November";        
                break;        
            case 12:
                nameMounth = "December";        
                break;        
            default:
                nameMounth = "Invalid mounth";
                break;
        }

        return nameMounth;
    }
}