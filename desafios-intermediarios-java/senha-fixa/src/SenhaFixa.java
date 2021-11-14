import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while(!leitor.next().equals("2002")) {
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
    }
}