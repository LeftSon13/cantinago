# Ambiente de desenvolvimento

## Pré-requisitos

- Git;
- JDK 21;
- terminal PowerShell no Windows;
- editor ou IDE de preferência.

O Maven Wrapper acompanha o projeto.

## Preparação

```powershell
git clone https://github.com/LeftSon13/cantinago.git
cd cantinago
java -version
git status
```

Confirme Java 21 antes de investigar falhas de compilação.

## Testes

```powershell
.\mvnw.cmd test
```

Resultado esperado no estado inicial: um teste, sem falhas ou erros, e `BUILD SUCCESS`.

## Executar

```powershell
.\mvnw.cmd spring-boot:run
```

O servidor usa a porta `8080`. Pressione `Ctrl + C` para encerrar. Um `404` em `http://localhost:8080/` é esperado enquanto não existir rota `/`.

## Antes de começar uma tarefa

```powershell
git switch main
git pull --ff-only origin main
git switch -c tipo/numero-descricao
```

## Problemas comuns

- **Java incompatível:** confira `java -version` e `JAVA_HOME`.
- **Porta 8080 ocupada:** encerre o processo anterior antes de mudar configurações.
- **Acentos estranhos no PowerShell:** leia com `Get-Content arquivo.md -Encoding UTF8`.
- **Avisos LF/CRLF:** são avisos de final de linha; revise o diff, mas não os trate automaticamente como erro lógico.
- **Dependências não baixam:** confirme conexão e tente novamente; não versione a pasta `target`.

## Ainda não necessário

Docker, banco de dados, Node.js e ferramentas de frontend não são pré-requisitos do estado atual.
