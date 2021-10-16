## Sobre

Desafio 1/3 do curso **["Primeiros desafios de código com Java"](../)**.

> Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.
>
> ## Entrada
>
> A entrada contém um único valor inteiro.
>
> ## Saída
>
> Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.
>
> | Exemplo de Entrada | Exemplo de Saída |
> | ------------------ | ---------------- |
> | 4                  | April            |

O código final foi escrito em cima da seguinte base:

```java
import java.io.IOException;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int month;
    month = input.nextInt();
    switch(month)
    {
    case 1:
        System.out.printf("January\n");
        break;
    case 2:
        System.out.printf("February\n");
        break;
       
    //continue sua solução aqui.

    default:
        System.out.printf("Invalid input\n");
    }
  }   
}
```