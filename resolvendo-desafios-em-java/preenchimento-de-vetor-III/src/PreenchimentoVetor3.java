import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class PreenchimentoVetor3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.0000");
        double X = leitor.nextDouble();
        BigDecimal[] N = new BigDecimal[100];
        N[0] = new BigDecimal(X);
        System.out.println("N[0] = " + formato.format(N[0]));

        for (int i = 1; i < 100; ++i) {
            N[i] = N[i - 1].divide(new BigDecimal(2));
            System.out.println("N[" + i + "] = " + formato.format(N[i]));
        }
    }
}