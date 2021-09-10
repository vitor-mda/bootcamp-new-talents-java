import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Uniformes {
    private final static Scanner IN = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int quantidadeCamisetas = Integer.parseInt(IN.nextLine());
        Camiseta[] camisetas = new Camiseta[quantidadeCamisetas];

        String linha;
        for(int i = 0; !((linha = IN.nextLine()).equals("0")); i++) {
            String nomeDono = linha;
            String[] infoCamiseta = IN.nextLine().split(" ");
            Camiseta camiseta = new Camiseta(infoCamiseta[0], infoCamiseta[1], nomeDono);
            camisetas[i] = camiseta;
        }

        Arrays.sort(camisetas);

        for(Camiseta c : camisetas) {
            System.out.println(c);
        }
    }
}

class Camiseta implements Comparable<Camiseta> {
    private final String cor;
    private final String tamanho;
    private final String dono;

    public Camiseta(String cor, String tamanho, String dono) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.dono = dono;
    }

    @Override
    public String toString() {
        return this.cor + " " + this.tamanho + " " + this.dono;
    }

    @Override
    public int compareTo(Camiseta outra) {
        int diferencaCor = this.cor.compareTo(outra.cor);
        if(diferencaCor < 0) {
            return -1;
        } else if(diferencaCor > 0) {
            return 1;
        }

        int diferencaTamanho = this.tamanho.compareTo(outra.tamanho);
        if(diferencaTamanho > 0) {
            return -1;
        } else if(diferencaTamanho < 0) {
            return 1;
        }

        int diferencaDono = this.dono.compareTo(outra.dono);
        if(diferencaDono < 0) {
            return -1;
        } else if(diferencaDono > 0) {
            return 1;
        }

        return 0;
    }
}