// Que. - 4. Write a Java program to display the system time.
package Three_String;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Four_Display_System_Time 
{
    public static void main(String[] args) 
    {
        LocalTime currentTime=LocalTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("-->> Current System Time : " + currentTime.format(formatter));
    }
}
