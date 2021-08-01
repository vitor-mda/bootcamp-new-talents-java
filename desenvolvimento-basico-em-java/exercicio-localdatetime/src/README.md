## Sobre

Pequeno exercício proposto durante a aula **Trabalhando com Datas -> Conhecendo date a partir do Java 8**.

> Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00

Código:

```java
LocalDateTime momento = LocalDateTime.of(2010, 5, 15, 10, 0);
System.out.println(momento + "\n+ 4 anos, 6 meses e 13 horas:\n" +
        momento.plusYears(4).plusMonths(6).plusHours(13));
```

Output:

```
2010-05-15T10:00
+ 4 anos, 6 meses e 13 horas:
2014-11-15T23:00
```