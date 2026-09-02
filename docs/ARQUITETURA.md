# Arquitetura

## Arquitetura atual

**[CONFIRMADO — REPOSITÓRIO]** O CantinaGO é uma aplicação Maven única em Java 21 e Spring Boot 4.0.7.

```text
pom.xml
src/main/java/br/com/cantinago/CantinagoApplication.java
src/main/resources/application.properties
src/test/java/br/com/cantinago/CantinagoApplicationTests.java
```

A classe `CantinagoApplication` é o ponto de entrada. O projeto possui Spring Web MVC e um teste que confirma o carregamento do contexto. Ainda não existem endpoints, persistência, domínio, autenticação ou frontend.

## Direção arquitetural

**[PROPOSTA]** Evoluir como aplicação modular única, com incrementos verticais pequenos. Uma organização possível, somente quando necessária, é:

```text
br.com.cantinago
├── product
│   ├── api
│   ├── application
│   └── domain
└── order
    ├── api
    ├── application
    └── domain
```

O formato final deve nascer do primeiro caso de uso; não devem ser criadas camadas vazias apenas para aparentar complexidade.

## Responsabilidades esperadas

- **API:** entrada e saída HTTP, validação de formato e códigos de resposta.
- **Aplicação:** coordenação dos casos de uso.
- **Domínio:** regras e conceitos do negócio.
- **Persistência:** armazenamento, quando escolhido.

Entidades de persistência não devem virar contratos HTTP automaticamente.

## Decisões pendentes

- banco de dados e estratégia de migrations;
- frontend e forma de integração;
- autenticação e autorização;
- contrato inicial da API;
- tratamento padronizado de erros;
- estratégia de testes integrados;
- implantação e configuração por ambiente.

Decisões relevantes e duradouras devem ser registradas em `docs/decisoes/`.
