import java.util.Scanner;

public class CrescenteEDecrescente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int Y = leitor.nextInt();
        while (X != Y) {
            System.out.println(X < Y ? "Crescente" : "Decrescente");
            X = leitor.nextInt();
            Y = leitor.nextInt();
        }
    }
}