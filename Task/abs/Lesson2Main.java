import java.time.LocalDate;

public class Lesson2Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(new DefaultStringDateConverter(now).dateAsString()); 
        System.out.println(new IsoStringDateConverter(now).dateAsString());
    }
    
}
