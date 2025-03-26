# Controle Financeiro

Um sistema simples e funcional para gerenciar suas finanças pessoais, desenvolvido com **Spring Boot** no back-end e **Angular** no front-end. O objetivo é facilitar o controle de receitas e despesas, oferecendo uma interface amigável e uma estrutura de código organizada seguindo os princípios de **Domain-Driven Design (DDD)**.

## 🚀 Funcionalidades
- **Adicionar Transações**: Permita ao usuário registrar receitas e despesas.
- **Listar Transações**: Exiba todas as transações com detalhes como descrição, valor, categoria e tipo.
- **Excluir Transações**: Remova transações desnecessárias ou incorretas.
- **Resumo Financeiro**: Calcule o saldo total, receitas e despesas.

## 🛠️ Tecnologias Utilizadas
### Back-end:
- **Spring Boot**: Para criação de APIs REST.
- **JPA/Hibernate**: Para gerenciamento de persistência no banco de dados.
- **MySQL**: Banco de dados relacional. (por enquanto está com h2)
- **Domain-Driven Design (DDD)**: Arquitetura estruturada por camadas.

### Front-end:
- **Angular**: Para criação de uma interface moderna e responsiva.
- **Angular Material**: Para componentes de UI estilizados.
- **Chart.js ou ngx-charts** (opcional): Para exibição de gráficos financeiros.

## 📂 Estrutura do Projeto (DDD)
### Back-End
- **Domain**: Modelos e regras de negócio.
- **Application**: Serviços e orquestração de casos de uso.
- **Infrastructure**: Persistência e configurações técnicas.
- **API**: Exposição de endpoints REST.

### Front-End
- Componentes para adicionar e listar transações.
- Serviços para consumir a API REST.

## 💡 Como Rodar o Projeto

### Backend:
1. Clone o repositório:
   ```bash
   git clone <url-repositorio>
