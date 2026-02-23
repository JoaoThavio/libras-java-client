# Libras Cliente Java

Aplicação Java responsável por consumir a API de reconhecimento de sinais em Libras.

Este projeto realiza requisições HTTP para a API FastAPI responsável pela classificação dos sinais, recebendo como resposta a letra identificada e exibindo o resultado no console ou integrando com outras aplicações.

---

## Objetivo

Este projeto demonstra:

- Consumo de API REST em Java
- Comunicação entre aplicações (Java <-> Python)
- Manipulação de requisições e respostas HTTP
- Organização modular de projeto backend

---

## Requisitos

- Java 17+ (recomendado)
- Maven ou Gradle (caso utilize gerenciamento de dependências)
- API de Libras em execução

---

## Estrutura do Projeto

libras-java-client/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── libras/
│                   ├── Main.java
│                   └── ApiClient.java
├── pom.xml (caso utilize Maven)
└── README.md

---

## Configuração

### 1. Clonar o repositório
git clone <url-do-repositorio>
cd libras-java-client

### 2. Instalar dependências (Maven)
mvn clean install

Ou, caso utilize Gradle:
gradle build

---

## Execução

Certifique-se de que a API Python esteja rodando em: http://127.0.0.1:8000

Em seguida, execute a aplicação:

### Via Maven
mvn exec:java -Dexec.mainClass="com.libras.Main"

### Ou compilando manualmente
javac src/main/java/com/libras/*.java
java com.libras.Main

---

## Exemplo de Requisição

A aplicação realiza uma requisição HTTP para o endpoint da API:
GET http://127.0.0.1:8000/predict

### Exemplo de Resposta da API
{
  "letra": "D"
}

### Resposta processada no Java
Letra reconhecida: D

---

## Arquitetura da Integração

Aplicação Java
       ↓
Requisição HTTP
       ↓
API FastAPI (Python)
       ↓
Modelo de Machine Learning
       ↓
Resposta JSON
       ↓
Processamento em Java

---

## Possíveis Evoluções

- Implementação de interface gráfica (JavaFX ou Swing)
- Tratamento avançado de exceções
- Logs estruturados
- Testes automatizados (JUnit)
- Integração com aplicações desktop ou web

## Observações

- A API Python deve estar ativa antes da execução do cliente Java.
- Certifique-se de que a porta 8000 esteja disponível.
- Caso altere a URL da API, atualize o endpoint em ApiClient.java.
