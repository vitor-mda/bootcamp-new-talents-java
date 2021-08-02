import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioExceptions {
    private static final Scanner sc = new Scanner(System.in);
    private static final String[] array = new String[]{
            "Elemento 0", "Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5"};

    public static void main(String[] args) {
        run();
        System.out.println("Tchau tchau! :)");
    }

    private static void run() {
        System.out.print("Digite o índice a ser acessado (de 0 a 5): ");

        try {
            System.out.println(getElemento(getInt()));
        } catch (ExerciseException e) {
            System.out.println("\n!ERRO!\n" + e.getMessage());
            sc.nextLine();
            run();
        }
    }

    private static int getInt() throws ExerciseException {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            throw new ExerciseException("Número inválido/Valor não numérico;\n\n", e);
        }
    }

    private static String getElemento(int indice) throws ExerciseException {
        try {
            return array[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ExerciseException("Índice inválido;\n\n", e);
        }
    }
}