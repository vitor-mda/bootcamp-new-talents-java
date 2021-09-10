import java.io.IOException;
import java.util.Scanner;

public class EvitandoChuva {
        private static final String CHUVA = "chuva";

        public static void main(String[] args) throws IOException {
                int casaComprado = 0;
                int casaSobrando = 0;
                int trabComprado = 0;
                int trabSobrando = 0;
                Scanner leitor = new Scanner(System.in);
                int N = leitor.nextInt();
                leitor.nextLine();

                for(int i = 0; i < N; i++) {
                        String[] previsoes = leitor.nextLine().split(" ");
                        String previsaoIdaTrabalho = previsoes[0];
                        String previsaoVoltaTrabalho = previsoes[1];
                        if(previsaoIdaTrabalho.equals(CHUVA)) {
                                if(casaSobrando == 0) {
                                        casaComprado++;
                                } else {
                                        casaSobrando--;
                                }

                                trabSobrando++;
                        }
                        if(previsaoVoltaTrabalho.equals(CHUVA)) {
                                if(trabSobrando == 0) {
                                        trabComprado++;
                                } else {
                                        trabSobrando--;
                                }

                                casaSobrando++;
                        }
                }

                System.out.println(casaComprado + " " + trabComprado);
        }
}