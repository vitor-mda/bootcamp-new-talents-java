## Sobre

Pequeno exercício de polimorfismo proposto durante a aula **Orientação a Objetos com Java -> Encapsulamento, herança e polimorfismo**.

> Vamos pensar em um cenário onde temos Funcionários. Esses funcionários podem ser: Gerente, Supervisor e Atendente.
>
> Cada tipo de funcionário desses tem políticas diferentes de impostos:
>
> - Gerente paga 0,1% do salário;
> - Supervisor paga 0,05% do salário;
> - Atendente paga 0,01% do salário;
>
> Monte um modelo que atenda esse cenário.

A classe ``Funcionario`` e seu método ``getImposto()`` foram declarados como ``abstract``, já que não há uma implementação padrão para o método ``getImposto()``.

Classe ``AppFuncionarios`` imprime o resultado das diferentes implementações do cálculo de imposto.

```java
Funcionario f1 = new Atendente(2500);
Funcionario f2 = new Supervisor(2500);
Funcionario f3 = new Gerente(2500);

System.out.println("Imposto do Atendente:\n\tR$" + f1.getImposto());
System.out.println("Imposto do Supervisor:\n\tR$" + f2.getImposto());
System.out.println("Imposto do Gerente:\n\tR$" + f3.getImposto());
/* output:
Imposto do Atendente:
	R$0.25
Imposto do Supervisor:
	R$1.25
Imposto do Gerente:
	R$2.5
*/
```