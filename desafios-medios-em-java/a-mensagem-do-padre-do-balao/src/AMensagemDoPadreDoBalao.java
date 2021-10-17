import java.util.Scanner;

public class AMensagemDoPadreDoBalao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while(leitor.hasNext()) {
            String alphabet = leitor.next();
            int letters = leitor.nextInt();
            StringBuilder word = new StringBuilder();

            for(int i = 0; i < letters; i++) {
                int letter = leitor.nextInt() - 1;
                word.append(alphabet.charAt(letter));
            }

            System.out.println(word);
        }
    }
}