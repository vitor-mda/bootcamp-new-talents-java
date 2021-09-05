## Sobre

Desafio 2/3 dos **["Desafios matemáticos em Java"](../../)**.

> Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz **M**\[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área esquerda da matriz, conforme ilustrado abaixo (área verde).
>
> ![img](https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1189.png)
>
> ### Entrada
>
> A primeira linha de entrada contem um único caractere Maiúsculo **O** ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.
>
> ### Saída
>
> Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
>
> | Exemplo de Entrada           | Exemplo de Saída |
> | ---------------------------- | ---------------- |
> | S|111.4|
> | 1.0||
> |330.0||
> |-3.5||
> |2.5||
> |4.1||
> |... |             |



O código final foi escrito em cima da seguinte base:

```java
import java.io.IOException;
import java.util.Scanner;

public class  {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (               ) {
        	for (                 ) {
        		M[i][j] = leitor.nextDouble();
        	}
        }
        
        for (                    ) {
        	for (                     ) {
        		if (                  ) soma += M[i][j];
        	}
        }

        if (                     ) soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }
	
}
```