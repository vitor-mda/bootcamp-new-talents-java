import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioDateFormat {
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("'Data e hora atual:\n\t- 'dd/MM/yyyy'\n\t- 'HH:mm:ss:SSS").format(new Date()));
    }
}