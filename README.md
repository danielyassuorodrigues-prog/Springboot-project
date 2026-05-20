# 💈 Barbershop appointment System

Sistema completo de agendamento desenvolvido com **Spring Boot** no backend e **HTML, CSS e JavaScript** no frontend, utilizando integração via **API REST**.

O projeto permite o cadastro de agendamentos contendo:

- Nome do cliente
- Telefone
- Serviço
- Data
- Hora

Todos os dados são persistidos em um banco de dados **MySQL**.

---

# 🚀 Tecnologias Utilizadas

## 🔹 Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL

## 🔹 Frontend
- HTML5
- CSS3
- JavaScript

---

# 🧠 Conceitos Aplicados

Durante o desenvolvimento deste projeto foram aplicados principalmente:

- Programação Orientada a Objetos (POO)
    - Herança
    - Polimorfismo
    - Encapsulamento

- Boas práticas de programação
- Desenvolvimento de API REST
- Integração Frontend + Backend
- Manipulação de dados com Spring Data JPA
- Persistência de dados com Hibernate
- Organização em arquitetura em camadas

---

# 🏗️ Arquitetura do Projeto

O backend foi estruturado utilizando arquitetura em camadas:

```text
Controller
Service
Repository
Entities

```

# 🧠 Integração frontend e backend

A comunicação entre frontend e backend foi realizada utilizando:

- Fetch API (JavaScript)
- Requisições HTTP
- API REST desenvolvida com Spring Boot

# 📚 Objetivo do Projeto

Projeto desenvolvido para fins educacionais, com foco em:

- Desenvolvimento Full Stack
- Consumo de APIs REST
- Integração entre camadas
- Organização de aplicações web
- Aplicação de boas práticas de desenvolvimento e segurança

### 1️⃣ Configurar o banco de dados
-> Configure o arquivo application.properties:  

    -> spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco  
    
    -> spring.datasource.username=seu_usuario  
    
    -> spring.datasource.password=sua_senha
    
### 2️⃣ Executar o backend
-> mvn spring-boot:run

### 3️⃣ Executar o frontend 
-> Utilize o live  server do vscode ou diretamente pela springboot em /static

### 👨‍💻 Autor

Desenvolvido por Daniel Yassuo Rodrigues.



