## Sobre

Desafio 1/3 do curso **["Introdução a Programação em Java"](../)**.

> O microblog Twitter é conhecido por limitar as postagens em 140 caracteres. Conferir se um texto vai caber em um tuíte é sua tarefa.
> 
>### Entrada
> 
>A entrada é uma linha de texto **T** (1 ≤ |**T**| ≤ 500).
> 
>### Saída
> 
>A saída é dada em uma única linha. Ela deve ser "TWEET" (sem as aspas) se a linha de texto **T** tem até 140 caracteres. Se **T** tem mais de 140 caracteres, a saída deve ser "MUTE".
> 
>| Exemplo de Entrada                                           | Exemplo de Saída |
> | ------------------------------------------------------------ | ---------------- |
> | RT @TheEllenShow: If only Bradley's arm was longer. Best photo ever. #oscars pic.twitter.com/C9U5NOtGap | TWEET            |

O código final foi escrito em cima da seguinte base:

```java
import java.io.IOException;
import java.util.Scanner;

public class Problem {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	String T = leitor.nextLine();
    	System.out.println(T.length() >     ? "MUTE" : "TWEET"); //complete a condicional
    }
	
}
```