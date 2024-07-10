# ForumHub
[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.1-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Hibernate](https://img.shields.io/badge/Hibernate-6.1.10-blue.svg)](https://hibernate.org/)
[![MySQL](https://img.shields.io/badge/MySQL-5.7+-blue.svg)](https://www.mysql.com/)
[![MIT License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## Índice

- [Descrição do Projeto](#descrição-do-projeto)
- [Status do Projeto](#status-do-projeto)
- [Funcionalidades e Demonstração da Aplicação](#funcionalidades-e-demonstração-da-aplicação)
- [Acesso ao Projeto](#acesso-ao-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Pessoas Contribuidoras](#pessoas-contribuidoras)
- [Pessoas Desenvolvedoras do Projeto](#pessoas-desenvolvedoras-do-projeto)
- [Licença](#licença)

## Descrição do Projeto

ForumHub é uma aplicação desenvolvida para gerenciar a plataforma de fórum da Alura, permitindo a criação, listagem, detalhamento e atualização de tópicos. A aplicação utiliza Spring Boot para a construção da API, JPA/Hibernate para a persistência de dados e JWT para a segurança.

## Status do Projeto
Finalizado


## Funcionalidades e Demonstração da Aplicação

### Funcionalidades

- **Autenticação de Usuários**
  - Login com geração de JWT

- **Gerenciamento de Tópicos**
  - Criação de novos tópicos
  - Listagem de todos os tópicos
  - Detalhamento de um tópico específico
  - Atualização de tópicos existentes

### Demonstração da Aplicação

**Endpoint de Autenticação:**

- **POST** `/login`
  - Autentica um usuário e retorna um JWT.
  - Json requer email e senha

  
**Endpoints de Tópicos:**

- **POST** `/topicos`
  - Cria um novo tópico.
  - Requer titulo, mensagem, autor e curso
- **GET** `/topicos`
  - Recupera uma lista de tópicos.
- **GET** `/topicos/{id}`
  - Recupera detalhes de um tópico específico.
- **PUT** `/topicos/{id}`
  - Atualiza um tópico específico.
  - é possível atualizar titulo e mensagem 

## Acesso ao Projeto

1. **Clone o repositório:**

   ```bash
   git clone <repository-url>
   cd forum_hub
   ```

2. **Configure o banco de dados:**

   Certifique-se de que o MySQL está em execução e crie um banco de dados chamado `forum_hub`.

   ```sql
   CREATE DATABASE forum_hub;
   ```

3. **Configure as propriedades da aplicação:**

   Configure seu `application.properties` ou `application.yml` com as propriedades necessárias do banco de dados e JWT.

   **application.properties:**

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:8080/forum_hub
   spring.datasource.username=root
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update

   api.security.token.secret=sua-chave-secreta
   ```

4. **Execute os scripts de migração:**

   Use o Flyway para executar os scripts de migração localizados em `resources/db.migration`.

   ```bash
   mvn flyway:migrate
   ```

5. **Compile e execute a aplicação:**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

Claro! Aqui está um exemplo de como você pode estruturar o tópico de dependências no seu README.md para o GitHub:

---

## Dependências

Este projeto utiliza as seguintes dependências:

- [Lombok](https://projectlombok.org/): Biblioteca para reduzir o código boilerplate em classes Java.
- [Spring Web](https://spring.io/guides/gs/serving-web-content/): Framework web do Spring para desenvolvimento de APIs RESTful.
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools): Ferramentas de desenvolvimento para agilizar o desenvolvimento com o Spring Boot.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa): Facilita a implementação de camadas de persistência baseadas em JPA.
- [Flyway Migration](https://flywaydb.org/): Biblioteca para gerenciar migrações de banco de dados.
- [MySQL Driver](https://dev.mysql.com/downloads/connector/j/): Driver JDBC para conexão com o MySQL.
- [Validation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#validation): Módulo do Spring Framework para validação de dados.
- [Spring Security](https://spring.io/projects/spring-security): Framework de autenticação e controle de acesso para aplicações Java.


## Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3.3.1**
- **Hibernate 6.1.10**
- **MySQL 5.7+**
- **JWT**
