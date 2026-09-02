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
- aplicação única sem endpoints de negócio ou persistência;
- teste inicial de contexto Spring.

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
- não realizar merge sem aprovação de outro integrante;
- não misturar melhorias oportunistas ao escopo;
- preservar mudanças existentes de outros integrantes;
- não desabilitar testes para obter sucesso;
- revisar diff antes de commit ou PR;
- atualizar documentação afetada;
- nunca registrar segredos ou dados pessoais desnecessários.

## Forma de colaboração

- escreva em português brasileiro;
- explique teoria, motivo, ação e validação;
- adapte a explicação ao nível de quem está aprendendo;
- prefira incrementos pequenos e demonstráveis;
- informe limitações e incertezas;
- não entregue grandes mudanças automáticas sem torná-las revisáveis.

## Decisões

Crie registro em `docs/decisoes/` para escolhas arquiteturais relevantes e duradouras. Não crie documentos vazios. Mantenha links internos válidos e use o histórico Git como evidência de evolução.
