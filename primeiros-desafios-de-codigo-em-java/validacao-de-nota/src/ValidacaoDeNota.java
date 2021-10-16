import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[2];

        for(int quantidadeNotasValidas = 0; quantidadeNotasValidas < 2;) {
            double nota = scanner.nextDouble();
            if(nota >= 0 && nota <= 10) {
                notas[quantidadeNotasValidas] = nota;
                quantidadeNotasValidas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        System.out.printf("media = %.2f", (notas[0] + notas[1]) / 2 );
    }
}