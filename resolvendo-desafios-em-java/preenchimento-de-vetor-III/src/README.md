## Sobre

Desafio 1/3 dos [**"Resolvendo Desafios em Java"**](../../).

>Leia um valor **X**. Coloque este valor na primeira posição de um vetor **N**[100]. Em cada posição subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor **N**.
>
>## Entrada
>
>A entrada contem um valor de dupla precisão com 4 casas decimais.
>
>## Saída
>
>Para cada posição do vetor **N**, escreva "N[_i_] = Y", onde _i_ é a posição do vetor e **Y** é o valor armazenado naquela posição. Cada valor do vetor deve ser apresentado com 4 casas decimais.
>
> 
>
>| Exemplo de Entrada | Exemplo de Saída                                             |
>| ------------------ | ------------------------------------------------------------ |
>| 200.0000           | N[0] = 200.0000
>|			     | N[1] = 100.0000
>|            		  | N[2] = 50.0000
>|			     | N[3] = 25.0000
>| 			      | N[4] = 12.5000
>|			     |...
>

Devido a problemas de precisão na hora de validar o desafio, foi necessário usar as classes `BigDouble` e `DecimalFormat`.

O código final foi escrito em cima da seguinte base:

```java
import java.io.IOException;
import java.util.Scanner;

public class{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double X = leitor.nextDouble();
        double[] N = new double[100];
        N[0] = X;
        for (                                       ) {
        	
        }
        for (                              ) {
        	System.out.println(String.format("N[" + i + "] = %.4f", N[i]));
        }
    }
	
}
```