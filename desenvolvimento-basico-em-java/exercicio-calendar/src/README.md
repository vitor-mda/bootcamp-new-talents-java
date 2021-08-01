## Sobre

Pequeno exercício proposto durante a aula **Trabalhando com Datas -> Classe Calendar**.

> Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que os juros sejam cobrados.
>
> Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte.
>
> Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.

Foram criadas as classes `Fatura` e `FaturaApp`.

Cada instancia de `Fatura` consegue calcular sua própria data de pagamento máxima, baseada em uma data de vencimento e dias de tolerância passados como parâmetros para o construtor.

```java
Fatura(Calendar dataVencimento, int diasTolerancia) {
    this.dataVencimento = dataVencimento;
    this.dataPagtoMax = getDataPagtoMax(dataVencimento, diasTolerancia);
}
```

A classe `AppFatura` instancia três objetos da classe `Fatura` para testá-la:

- `faturaVenceDomingo`:
  - recebe um `Calendar` definido para uma quarta-feira arbitrária, pois qualquer quarta-feira + 10 dias cairá em um domingo;
- `faturaVenceSabado`:
  - recebe um `Calendar` definido para uma quinta-feira arbitrária, pois qualquer quinta-feira + 10 dias cairá em um sábado;
- `faturaVenceHoje`:
  - recebe um `Calendar` instanciado com a data atual usando `Calendar.getInstance()`;



O output do programa consiste em strings formatadas com o **dia de vencimento** e **dia de pagamento máximo** das três faturas instanciadas.

```java
/*
=========================================
Fatura com vencimento no dia:
	14 de julho de 2021 (quarta-feira)

poderá ser paga sem juros até o dia:
	26 de julho de 2021 (segunda-feira)
=========================================

=========================================
Fatura com vencimento no dia:
	15 de julho de 2021 (quinta-feira)

poderá ser paga sem juros até o dia:
	26 de julho de 2021 (segunda-feira)
=========================================

=========================================
Fatura com vencimento no dia:
	31 de julho de 2021 (sábado)

poderá ser paga sem juros até o dia:
	10 de agosto de 2021 (terça-feira)
=========================================
*/
```
