import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        LocalDateTime suAnkiTarihSaat = LocalDateTime.now();
        System.out.println(suAnkiTarihSaat);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(suAnkiTarihSaat));


    }
}
