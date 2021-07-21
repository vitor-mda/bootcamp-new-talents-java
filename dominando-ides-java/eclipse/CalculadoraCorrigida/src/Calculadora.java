import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {	
	private static Scanner sc = new Scanner(System.in);
	private static int n1, n2;
	private static String escolha;
	
	public static void main(String[] args) {
		
		System.out.printf("---------- CALCULADORA ----------%nDigite dois n�meros e veja"
				+ "%no resultado das quatro opera��es"
				+ "%nb�sicas realizadas com eles!%n---------------------------------%n");
		
		calcular();
	}
	
	private static void calcular() {
		System.out.print("\nPrimeiro n�mero: ");
		n1 = getNumero();
		
		System.out.print("\nSegundo n�mero: ");
		n2 = getNumero();
		
		System.out.printf("%n========== RESULTADOS: ==========%n"
				+ "%n\tSOMA:%n%d + %d = %d%n"
				+ "%n\tSUBTRA��O:%n%d - %d = %d%n"
				+ "%n\tMULTIPLICA��O:%n%d * %d = %d%n"
				+ "%n\tDIVIS�O:%n%d / %d = %.2f%n%n",
					n1, n2, n1+n2,
					n1, n2, n1-n2,
					n1, n2, n1*n2,
					n1, n2, (float)n1/n2);
		
		System.out.println("Digite SAIR para sair ou tecle\nENTER para calcular novos n�meros");
		sc.nextLine();
		escolha = sc.nextLine();
		
		if(!escolha.toUpperCase().equals("SAIR")) {
			calcular();
		} else {
			sc.close();
			System.out.println("\nTchau tchau! :)\n------ PROGRAMA  ENCERRADO ------");
		}
	}
	
	private static int getNumero() {
		int n;
		try {
			n = sc.nextInt();
			return n;
		} catch(InputMismatchException e) {
			System.out.printf("%nERRO: N�mero Inv�lido/Valor N�o Num�rico.%nPor favor, digite um n�mero v�lido: ");
			sc.nextLine();
			return getNumero();
		}
	}
}