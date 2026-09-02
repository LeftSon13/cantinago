# Uso responsável de inteligência artificial

IA pode apoiar o aprendizado e o desenvolvimento, mas não substitui entendimento, teste, decisão da equipe ou Code Review.

## Usos recomendados

- explicar código e conceitos;
- ajudar a investigar erros;
- sugerir testes e casos extremos;
- revisar clareza de documentação;
- estruturar Issues e descrições de PR;
- comparar alternativas técnicas;
- propor mudanças pequenas para revisão humana.

## Responsabilidades de quem usa

- fornecer contexto e critérios claros;
- conferir todos os arquivos alterados;
- entender o código antes de assumi-lo como próprio;
- executar testes relevantes;
- não enviar credenciais, dados pessoais ou segredos;
- não aceitar requisitos inventados;
- não usar IA para contornar revisão ou proteção da `main`;
- registrar decisões relevantes com a equipe.

## O que uma IA não deve decidir sozinha

- escopo e prioridade do produto;
- regras de negócio não aprovadas;
- banco, autenticação, frontend ou implantação;
- remoção de código ou dados relevantes;
- merge, release ou mudança de proteção da `main`;
- uso de dados pessoais.

## Modelo de solicitação

```text
Contexto: [estado atual e Issue]
Objetivo: [resultado verificável]
Escopo permitido: [arquivos/comportamentos]
Fora do escopo: [o que não deve mudar]
Critérios de aceitação: [lista]
Validação: [comandos e evidências]
Restrições: [tecnologias, segurança e processo]
Antes de alterar: inspecione o estado real e apresente um plano pequeno.
```

## Checklist antes de aceitar resultado de IA

- [ ] A solução atende à Issue sem ampliar o escopo?
- [ ] Consigo explicar o que mudou?
- [ ] Requisitos propostos foram validados?
- [ ] Testes foram executados?
- [ ] O diff foi revisado?
- [ ] Não há segredos ou dados indevidos?
- [ ] Documentação e código continuam coerentes?
- [ ] Outra pessoa fará Code Review?
