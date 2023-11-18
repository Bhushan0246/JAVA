import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Current_DateTime{
    public static void main(String[] args){
        //Display current date
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);
        //Display current complete time 
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);
        //Display current date & time 
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before formatting Date & Time: " + dateTime);
        /* Display current date & time in below defined pattern
        E - Day, EEEE - day(word_complete), dd - date
        MM - month(num), MMM - month(letter_short), MMMM - month(word_complete), yy - year(short), yyyy - year(complete)
        hh - hours, mm - minutes, ss - seconds, a - AM/PM */
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, dd-MMMM-yyyy, hh:mm:ss a");
        String formatted = dateTime.format(format);
        System.out.println("After formatting: " + formatted);
    }
}