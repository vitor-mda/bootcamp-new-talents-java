import java.util.Scanner;

public class DividindoXPorY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 0, X, Y; i < N; i++) {
            X = scanner.nextInt();
            Y = scanner.nextInt();

            System.out.println(Y != 0 ? String.format("%.1f", (double) X / Y) : "divisao impossivel");
        }
    }
}