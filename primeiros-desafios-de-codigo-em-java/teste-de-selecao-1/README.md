## Sobre

Desafio 2/3 do curso **["Primeiros desafios de código com Java"](../)**.

> Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for maior do que de C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se tanto C quanto D forem positivos e, ainda, se a variável A for par, escreva a mensagem **"Valores aceitos"**, senão escrever **"Valores nao aceitos"**.
>
> ## Entrada
>
> Quatro números inteiros A, B, C e D.
>
> ## Saída
>
> Imprima a mensagem corretamente esperada pela validação dos valores.
>
> | Exemplo de Entrada | Exemplo de Saída    |
> | ------------------ | ------------------- |
> | 5 6 7 8            | Valores nao aceitos |
> | 2 3 2 6            | Valores aceitos     |

O código final foi escrito em cima da seguinte base:

```java
import java.util.Scanner;

public class Problem{

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		//implemente a condição abaixo para ter o resultado esperado
		if (                   ) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}
```