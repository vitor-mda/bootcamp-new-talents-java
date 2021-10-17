import java.text.DecimalFormat;
import java.util.Scanner;

public class ReservatorioDeMel {
    public static void main(String[] args) {
        final Scanner leitor = new Scanner(System.in);
        final DecimalFormat df = new DecimalFormat("0.00");
        double volume, diametro, raio, area, altura;
        while (leitor.hasNext()) {
            volume = leitor.nextDouble();
            diametro = leitor.nextDouble();
            raio = diametro / 2;
            area = 3.14 * Math.pow(raio, 2);
            altura = volume / area;
            System.out.println("ALTURA = " + df.format(altura));
            System.out.println("AREA = " + df.format(area));
        }
    }
}