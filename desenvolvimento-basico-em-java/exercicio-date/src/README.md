## Sobre

Pequeno exercício proposto durante a aula **Trabalhando com Datas -> Classe Date**.

> Aplique o que aprendemos:
>
> - Descubra o **timeInMillis** do dia em que você nasceu;
> - Converta em um objeto Date;
> - Verifique se ele é **anterior** ou **posterior** a **15 de maio de 2010**.

Foi proposto pelo professor que apenas buscassemos na internet o valor do nosso aniversário em milissegundos, mas utilizei o próprio retorno do método `getTime()` de um objeto `Date` que foi instanciado passando o meu ano de nascimento menos 1900, o mês menos um e o dia — assim como é especificado na classe `Date`.

```java
Date aniversario = new Date(
        new Date(1993-1900, 6-1, 21).getTime()
);
```

Essa operação redundante foi feita apenas para satisfazer a prática proposta na aula, que consiste em instanciar um objeto `Date` a partir da data do aniversário em milissegundos.

No final, o código imprime a seguinte `String`:

```java
"Data do aniversário (21 de jun de 1993 00:00:00) é anterior à data 15 de mai de 2010 00:00:00"
```