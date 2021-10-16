import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        int tempoTotalEmSegundos = new Scanner(System.in).nextInt();
        int horas = tempoTotalEmSegundos / 3600;
        int minutos = tempoTotalEmSegundos / 60 - 60 * horas;
        int segundos = tempoTotalEmSegundos - 3600 * horas - 60 * minutos;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}