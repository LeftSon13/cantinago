# CantinaGO

Sistema web para gerenciamento de pedidos de cantina, desenvolvido pela equipe do Jovem Programador - SENAC.

## Tecnologias iniciais

- Java 21
- Spring Boot 4.0.7
- Maven

## Pré-requisitos

Para executar o projeto, é necessário possuir:

- Java 21
- Git

Não é necessário instalar o Maven globalmente, pois o projeto utiliza o Maven Wrapper.

## Executando o projeto

No Windows, abra o terminal na raiz do projeto e execute:

```powershell
.\mvnw.cmd spring-boot:run
```

Quando a aplicação iniciar corretamente, o servidor estará disponível em:

```text
http://localhost:8080
```

Neste estágio inicial ainda não existe uma rota configurada para `/`, portanto acessar esse endereço pode retornar `404 Not Found`.

Isso é esperado enquanto os endpoints da aplicação ainda não forem implementados.

## Desenvolvimento

O desenvolvimento do CantinaGO utiliza GitHub Issues, branches por atividade, Pull Requests e Code Review.

Alterações não devem ser desenvolvidas diretamente na branch `main`.