package java_Slips;
import java.time.*;
import java.time.format.*;

public class slip13_q2 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt = ZonedDateTime.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String first = ldt.format(f1);
        System.out.println("Current Date -> " + first);

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String second = ldt.format(f2);
        System.out.println("Current Date -> " + second);

        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEEE MMMM dd yyyy");
        String third = ldt.format(f3);
        System.out.println("Current Date -> " + third);

        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("EEE MMMM dd HH:mm:ss z yyyy");
        String formattedDateTime4 = zdt.format(f4);
        System.out.println("Current date and time is : " + formattedDateTime4);

        DateTimeFormatter f5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a Z");
        String fifth = zdt.format(f5);
        System.out.println("Current Date and Time : " + fifth);
    }
}
