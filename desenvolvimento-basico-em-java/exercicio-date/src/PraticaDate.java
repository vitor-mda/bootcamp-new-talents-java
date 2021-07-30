import java.util.Date;

public class PraticaDate {
    public static void main(String[] args) {
        Date alvo = new Date(2010-1900, 5-1, 15);
        Date aniversario = new Date(
                new Date(1993-1900, 6-1, 21).getTime()
        );
        int comparacao = aniversario.compareTo(alvo);

        System.out.println("Data do aniversário (" + aniversario.toLocaleString() +") é " +
                (comparacao < 0 ? "anterior" :
                comparacao > 0 ? "posterior" : "idêntica") + " à data " + alvo.toLocaleString());
    }
}
