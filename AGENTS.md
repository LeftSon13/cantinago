# Instruções para agentes — CantinaGO

## Missão

Apoiar a equipe no desenvolvimento e aprendizado do CantinaGO, preservando o escopo, o fluxo colaborativo e a diferença entre estado confirmado, proposta e pendência.

## Fontes de verdade

```text
estado atual do software → repositório, Git, configuração e testes
prioridade e Sprint → Product Backlog/Trello e decisões do Product Owner
escopo de uma alteração → Issue e critérios de aceitação
regras vigentes → documentação aprovada e decisões registradas
```

Não transforme memória de conversa em requisito definitivo. Não contradiga o código atual com documentação desatualizada.

## Antes de alterar

1. leia `README.md`, `docs/README.md` e os documentos relacionados;
2. inspecione branch, status, histórico, diff e arquivos afetados;
3. identifique a Issue e seus critérios;
4. classifique achados como confirmados, propostas ou pendências;
5. apresente objetivo, plano pequeno, arquivos e validação;
6. peça decisão humana quando uma escolha mudar produto, arquitetura ou escopo.

## Estado técnico atual

- Java 21;
- Spring Boot 4.0.7;
- Maven Wrapper;
- Spring Web MVC;
- aplicação única com catálogo fictício em memória disponível por `GET /api/produtos`;
- sem persistência, autenticação ou frontend integrado;
- testes de contexto Spring e do contrato HTTP do catálogo.

Comandos Windows:

```powershell
.\mvnw.cmd test
.\mvnw.cmd spring-boot:run
```

## Desenvolvimento

Preserve o fluxo:

```text
Issue → branch → implementação pequena → testes → PR → review → merge
```

- não desenvolver diretamente na `main`;
- não criar ou alterar requisitos sem validação;
- não realizar merge sem pelo menos uma aprovação de outro integrante;
- solicitar revisão de todos os outros integrantes ativos da equipe;
- não bloquear a publicação ou o merge apenas porque parte dos revisores convidados ainda não respondeu, desde que exista a aprovação obrigatória e não haja solicitação de mudança pendente;
- não misturar melhorias oportunistas ao escopo;
- preservar mudanças existentes de outros integrantes;
- não desabilitar testes para obter sucesso;
- revisar diff antes de commit ou PR;
- atualizar documentação afetada;
- nunca registrar segredos ou dados pessoais desnecessários.
- usar português brasileiro, sem acentos ou cedilha, nos nomes de pacotes, classes, métodos, variáveis e testes criados pelo projeto;
- usar português brasileiro também nos contratos criados pelo CantinaGO, incluindo rotas e campos JSON;
- preservar somente os termos técnicos impostos pelas linguagens, protocolos, bibliotecas e ferramentas utilizadas.
- usar JavaDoc curto em conceitos, contratos ou decisões não óbvias que ajudem o estudo e a revisão;
- incluir exemplos pequenos somente quando eles tornarem o comportamento mais claro;
- explicar o motivo ou o efeito relevante, sem repetir cada linha do código;
- manter comentários coerentes com o código e remover explicações que se tornarem obsoletas.

## Forma de colaboração

- escreva em português brasileiro;
- explique teoria, motivo, ação e validação;
- adapte a explicação ao nível de quem está aprendendo;
- prefira incrementos pequenos e demonstráveis;
- informe limitações e incertezas;
- não entregue grandes mudanças automáticas sem torná-las revisáveis.

## Decisões

Crie registro em `docs/decisoes/` para escolhas arquiteturais relevantes e duradouras. Não crie documentos vazios. Mantenha links internos válidos e use o histórico Git como evidência de evolução.
