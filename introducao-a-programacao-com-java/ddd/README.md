## Sobre

Desafio 2/3 do curso **["Introdução a Programação em Java"](../)**.

> Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
>
> | DDD  | Destination    |
> | ---- | -------------- |
> | 61   | Brasilia       |
> | 71   | Salvador       |
> | 11   | Sao Paulo      |
> | 21   | Rio de Janeiro |
> | 32   | Juiz de Fora   |
> | 19   | Campinas       |
> | 27   | Vitoria        |
> | 31   | Belo Horizonte |
>
> Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
> DDD nao cadastrado
>
> ### Entrada
>
> A entrada consiste de um único valor inteiro.
>
> ### Saída
>
> Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima *DDD nao cadastrado* caso não existir DDD correspondente ao número digitado.
>
> | Exemplo de Entrada | Exemplo de Saída |
> | ------------------ | ---------------- |
> | 11                 | Sao Paulo        |

O código final foi escrito em cima da seguinte base:

```java
import java.io.IOException;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int a;
    a = input.nextInt();
    switch(a)
    {
        case 61:
        {
            System.out.printf("Brasilia\n");
            break;
        }
        case :   //complete os DDD's corretamente
        {
            System.out.printf("Salvador\n");
            break;
        }
        case :
        {
            System.out.printf("Sao Paulo\n");
            break;
        }
        case :
        {
            System.out.printf("Rio de Janeiro\n");
            break;
        }
        case :
        {
            System.out.printf("Juiz de Fora\n");
            break;
        }
        case :
        {
            System.out.printf("Campinas\n");
            break;
        }
        case :
        {
            System.out.printf("Vitoria\n");
            break;
        }
        case :
        {
            System.out.printf("Belo Horizonte\n");
            break;
        }
        default:
        {
            System.out.printf("DDD nao cadastrado\n");
            break;
        }
     }
  }
}
```