# Cadastro de Ninja

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-21-orange)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen)](https://spring.io/projects/spring-boot)

Uma API RESTful para cadastro e gerenciamento de ninjas e suas missões usando Spring Boot.

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4.5
- Spring Data JPA
- Lombok
- H2 Database (banco de dados em memória)
- Maven

## 📋 Descrição do Projeto

Este projeto implementa uma API para gerenciar cadastros de ninjas e suas missões. A aplicação permite:

- Cadastrar e gerenciar ninjas
- Cadastrar e gerenciar missões
- Associar ninjas a missões

## 🏗️ Estrutura do Projeto

```
src/main/java/dev/java10x/CadastroDeNinja/
├── CadastroDeNinjaApplication.java   # Classe principal da aplicação
├── Ninjas/                           # Pacote para funcionalidades de ninjas
│   ├── NinjaController.java          # Controlador REST para ninjas
│   └── NinjaModel.java               # Modelo/Entidade para ninjas
└── Missoes/                          # Pacote para funcionalidades de missões
    └── MissoesModel.java             # Modelo/Entidade para missões
```

## 🗃️ Modelo de Dados

### Entidade Ninja
- **id**: Long (chave primária)
- **nome**: String
- **email**: String
- **idade**: int
- **missoes**: MissoesModel (relação ManyToOne)

### Entidade Missão
- **id**: Long (chave primária)
- **nome**: String
- **dificuldade**: String
- **ninjas**: List<NinjaModel> (relação OneToMany)

## ⚙️ Configuração e Instalação

### Pré-requisitos
- JDK 21
- Maven 3.6+ 

### Passos para Execução

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/cadastroDeNinja.git
cd cadastroDeNinja/CadastroDeNinja
```

2. Compile o projeto:
```bash
mvn clean install
```

3. Execute a aplicação:
```bash
mvn spring-boot:run
```

4. Acesse a aplicação em [http://localhost:8080](http://localhost:8080)
5. Console do H2 Database disponível em [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

### Configuração do Banco de Dados H2

```
URL: jdbc:h2:mem:ninjadb
Username: sa
Password: password
```

## 🔗 Endpoints da API

| Método | URL | Descrição |
|--------|-----|-----------|
| GET    | /boasvindas | Retorna uma mensagem de boas-vindas |

*Obs: Mais endpoints serão implementados para operações CRUD completas de ninjas e missões.*

## 📝 Relacionamentos

- Um ninja pode estar associado a uma missão (ManyToOne)
- Uma missão pode ter vários ninjas associados (OneToMany)

## 📄 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [`cadastroDeNinja/LICENSE`](cadastroDeNinja/LICENSE ) para mais detalhes.

---
