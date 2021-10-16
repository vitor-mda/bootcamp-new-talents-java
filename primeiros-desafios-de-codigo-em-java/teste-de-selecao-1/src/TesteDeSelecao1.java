import java.util.Scanner;

public class TesteDeSelecao1{

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if (b > c &&
            d > a &&
            c + d > a + b &&
            c > 0 && d > 0 &&
            a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}