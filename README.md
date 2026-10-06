# CantinaGO

Sistema web para facilitar a consulta de produtos, a realização de pedidos e o acompanhamento do atendimento em uma cantina. O projeto é desenvolvido pela Equipe 5 do Jovem Programador — SENAC e também serve como experiência prática de Scrum, Git, GitHub, testes e colaboração.

## Estado atual

**[CONFIRMADO — REPOSITÓRIO]**

- estrutura base integrada à `main` pela PR #2;
- Java 21, Spring Boot 4.0.7 e Maven Wrapper;
- primeiro endpoint de negócio: consulta do catálogo fictício em memória por `GET /api/produtos`;
- testes de carregamento do contexto Spring e do contrato HTTP do catálogo;
- aplicação ainda sem persistência, autenticação ou frontend integrado;
- desenvolvimento organizado por Issues, branches, Pull Requests e Code Review.

## Classificação das informações

- **[CONFIRMADO]**: verificado no repositório ou aprovado pela equipe;
- **[PROPOSTA]**: planejamento que ainda precisa de validação;
- **[PENDENTE]**: pergunta ou decisão ainda sem resposta;
- **[DECISÃO]**: escolha vigente da equipe.

## Executar no Windows

Pré-requisitos: Java 21 e Git. Não é necessário instalar Maven globalmente.

```powershell
.\mvnw.cmd test
.\mvnw.cmd spring-boot:run
```

A aplicação inicia em `http://localhost:8080`. O catálogo demonstrativo pode ser consultado em `http://localhost:8080/api/produtos`. O retorno `404 Not Found` para `/` é esperado enquanto não houver endpoint nessa rota.

## Documentação

Comece pelo [mapa da documentação](docs/README.md). Leituras principais:

- [Visão do produto](docs/VISAO_DO_PRODUTO.md)
- [Escopo e MVP](docs/ESCOPO_E_MVP.md)
- [Guia da equipe](docs/GUIA_DA_EQUIPE.md)
- [Como contribuir](CONTRIBUTING.md)
- [Uso responsável de IA](docs/USO_DE_INTELIGENCIA_ARTIFICIAL.md)

## Contribuição

O fluxo oficial é:

```text
Backlog → Issue → branch → implementação → testes → Pull Request → revisão → merge
```

Não desenvolva diretamente na `main`. Leia [CONTRIBUTING.md](CONTRIBUTING.md) antes da primeira contribuição.
