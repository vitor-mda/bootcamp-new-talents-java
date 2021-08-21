## Sobre

Exercício proposto durante a aula **Trabalhando com JPA-> Linguagens de consulta orientada a objetos**.

> 1. Crie uma consulta SQL e execute diretamente no Banco de Dados;
> 2. Realize a mesma consulta realizada no passo 1, porém no JPQL e execute na sua aplicação JPA;
> 3. Realize a mesma consulta realizada no passo 1, porém com o JPA Criteria API e execute na sua aplicação JPA.

Foram mapeadas duas entidades com relacionamento Many-To-Many ([`Aluno`](src/main/java/Aluno.java) e [`Curso`](src/main/java/Aluno.java)) e foi criada uma classe [`ExercicioJPA`](src/main/java/ExercicioJPA.java) para testar as diversas consultas propostas.

No início do programa, são carregados dados de exemplo de `Aluno` e `Curso` e são registradas algumas associações (`matricula`s) entre as entidades.

As queries #1 (SQL nativo) e #2 (JPQL) buscam alunos que foram matriculados em determinados cursos, enquanto a query #3 (Criteria API) busca todos os alunos.

O SGDB utilizado foi o MySQL e a implementação do JPA foi provida pelo Hibernate.



Output:

```
// consulta SQL nativa
Hibernate: 
    SELECT
        nome 
    FROM
        aluno 
    WHERE
        id IN (
            SELECT
                id_aluno 
            FROM
                matricula 
            WHERE
                id_curso = 1
        )
Alunos matriculados no curso Java Developer:
	- Joaquim
	- Bernardo
	- Maria
// consulta JPQL
Hibernate: 
    select
        aluno0_.nome as col_0_0_ 
    from
        Aluno aluno0_ 
    inner join
        matricula cursos1_ 
            on aluno0_.id=cursos1_.id_aluno 
    inner join
        Curso curso2_ 
            on cursos1_.id_curso=curso2_.id 
    where
        curso2_.id=?
Alunos matriculados no curso Fullstack Java and Angular:
	- Bianca
	- José
	- Helena
// consulta com Criteria Builder
Hibernate: 
    select
        aluno0_.id as id1_0_,
        aluno0_.nome as nome2_0_ 
    from
        Aluno aluno0_
O aluno sorteado foi:
	- Maria
```

