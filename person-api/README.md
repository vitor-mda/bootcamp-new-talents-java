|:cloud: [Deploy no Heroku](https://person-api-vitor-mda.herokuapp.com) :cloud:|
|:-:|

## Sobre

Desenvolvimento de um **Sistema de Gerenciamento de Pessoas em API REST com Spring Boot**, projeto proposto durante o bootcamp **["New Talents - Java"](../../../)**.

O projeto provê um serviço REST com funcionalidades de criação, leitura/listagem, atualização e exclusão (CRUD) de registros de pessoas de um banco de dados *in-memory* na nuvem através de métodos HTTP com o recurso [`/person`](https://person-api-vitor-mda.herokuapp.com/person).

Foram utilizadas as seguintes tecnologias/ferramentas:

- **Java 11**;
- **IntelliJ IDEA 2021.1.3 (Community Edition)**;
- **Maven 3.8.2**;
- **Spring Boot 2.5.4**, com as seguintes dependências:
  - **Spring Boot DevTools**;
  - **Lombok**;
  - **Spring Web**;
  - **Spring Data JPA**;
  - **Spring Boot Actuator**;
  - **H2 Database**;
  - **Hibernate Validator 6.2.0.Final** — inclusão pós-Spring Initializr não instruída pelo professor, mas, no meu caso, necessária para processar anotações de validação;
- **Mapstruct 1.4.2.Final**;
- **Heroku**, usando a buildpack [Subdir](https://github.com/timanovsky/subdir-heroku-buildpack) para especificar o diretório `person-api` como raíz do projeto;

Efetivamente, as únicas diferenças entre esse projeto e o do professor (https://github.com/rpeleias/personapi_digital_innovation_one) são a inclusão de uma classe controller para mostrar informações de texto na raíz da URI e um mapeamento para exibir informação de data no formato correto (dd-MM-yyyy).