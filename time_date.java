import java.sql.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class time_date {
    public static void main(String a[])
    {
        //Display Current Date
        LocalDate t = LocalDate.now();
        System.out.println(t);

        //Display Current Time
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        //Display Current Date and Time 
        LocalDateTime cdt = LocalDateTime.now();
        System.out.println(cdt);

        //Formatting Date and Time
        DateTimeFormatter cdtformatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formattedcdt = cdt.format(cdtformatter);
        System.out.println("After Formatting: "+formattedcdt);






    }
    
}
