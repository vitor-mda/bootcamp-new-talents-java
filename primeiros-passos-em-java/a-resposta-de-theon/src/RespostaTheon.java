import java.io.IOException;
import java.util.Scanner;

public class RespostaTheon {

        public static void main(String[] args) throws IOException {
                Scanner leitor = new Scanner(System.in);
                int N = leitor.nextInt();
                int T, menor = 0, posMenor = 0;

                for(int pos = 1; pos <= N; pos++) {
                        T = leitor.nextInt();

                        if(T < menor) {
                                menor = T;
                                posMenor = pos;
                        } else if(pos == 1) {
                                menor = T;
                                posMenor = pos;
                        }
                }

                System.out.println(posMenor);
                }
        }