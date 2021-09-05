import java.io.IOException;
import java.util.Scanner;

public class AreaInferior {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for(int i = 11, r = 0; i >= 0; i--, r++) {
            for(int j = 11; j >= 0; j--) {
                if(j > r && j < i) {
                    soma += M[i][j];
                }
            }
        }

        if (O == 'M') {
            soma /= 30;
        }

        System.out.printf("%.1f%n", soma);
    }
}