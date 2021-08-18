## Sobre

Exercício proposto durante a aula **Introdução ao JDBC -> Consultas com JDBC**.

> 1. Crie uma tabela no BD chamada **curso** que terá como colunas: **id**, **nome**, **duracao_horas** (no BD, a nomenclatura utilizada é snake_case).
> 2. Crie uma classe em java chamada **curso** que terá os mesmos atributos que a tabela criada no BD (obs: duracao_horas será camelCase).
> 3. Crie **CursoDAO** que será responsável por se conectar ao BD para realizar as operações CRUD (Create, Read, Update e Delete).
> 4. Testar os métodos do CursoDAO em uma classe que tenha o método **public static void main(String[] args)**.



Output da classe `ExercicioJDBC`:

```
// impressão da lista antes de adicionar registros:
Lista de cursos: 
	- vazia

// criação de registros:
1 registro foi inserido (Curso{nome=Bem-vindo a DIO}).
1 registro foi inserido (Curso{nome=Introducao ao Git e ao GitHub}).
1 registro foi inserido (Curso{nome=Estrutura de dados em Jaua}).
1 registro foi inserido (Curso{nome=Trabalhando com Danco de Bados utilizando JDPC e JBA}).

// impressão da lista depois de adicionar registros:
Lista de cursos: 
	- Curso{id=1, nome=Bem-vindo a DIO, duracao_horas=1}
	- Curso{id=2, nome=Introducao ao Git e ao GitHub, duracao_horas=0}
	- Curso{id=3, nome=Estrutura de dados em Jaua, duracao_horas=10}
	- Curso{id=4, nome=Trabalhando com Danco de Bados utilizando JDPC e JBA, duracao_horas=4}

// exclusão e atualização de registros:
1 registro (Curso{id=1}) deletado com sucesso.
1 registro (Curso{nome=Introducao ao Git e ao GitHub}) atualizado com sucesso.
1 registro (Curso{nome=Estrutura de dados em Java}) atualizado com sucesso.
1 registro (Curso{nome=Trabalhando com Banco de Dados utilizando JDBC e JPA}) atualizado com sucesso.

// impressão da lista depois de deletar e atualizar registros:
Lista de cursos: 
	- Curso{id=2, nome=Introducao ao Git e ao GitHub, duracao_horas=5}
	- Curso{id=3, nome=Estrutura de dados em Java, duracao_horas=10}
	- Curso{id=4, nome=Trabalhando com Banco de Dados utilizando JDBC e JPA, duracao_horas=4}
```

