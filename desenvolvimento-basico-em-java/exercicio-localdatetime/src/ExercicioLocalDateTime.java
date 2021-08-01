import java.time.LocalDateTime;

public class ExercicioLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime momento = LocalDateTime.of(2010, 5, 15, 10, 0);
        System.out.println(momento + "\n+ 4 anos, 6 meses e 13 horas:\n" +
                momento.plusYears(4).plusMonths(6).plusHours(13));
    }
}