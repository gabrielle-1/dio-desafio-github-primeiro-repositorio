import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message{

    public static void showMessage(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
        String hour = dtf.format(LocalDateTime.now());
        int hourInt = Integer.parseInt(hour);

        if( (hourInt > 05) && (hourInt < 13) ){
            obtainMessageMorning();
        }else if( (hourInt > 13) && (hourInt < 17) ){
            obtainMessageAfternoon();
        }else if( (hourInt > 17) && (hourInt <= 23) ){
            obtainMessageNight();            
        }else{
            obtainMessageDawn();
        }
    }

    public static void obtainMessageMorning(){
        System.out.println("Bom dia!");
    }

    public static void obtainMessageAfternoon(){
        System.out.println("Boa tarde!");
    }

    public static void obtainMessageNight(){
        System.out.println("Boa noite!");
    }

    public static void obtainMessageDawn(){
        System.out.println("Boa madrugada!");
    }

}