# Qualidade e testes

## Princípios

- testar comportamento relevante, não detalhes acidentais;
- todo bug corrigido deve ganhar teste quando viável;
- não desabilitar teste para obter build verde;
- manter mudanças pequenas e revisáveis;
- revisar arquivos alterados antes do commit e da PR;
- atualizar documentação afetada.

## Estado atual

Existe um teste de contexto Spring em `CantinagoApplicationTests`. Ele confirma que a aplicação consegue carregar, mas não valida funcionalidades de negócio.

## Evolução esperada

- testes unitários para regras de domínio;
- testes de aplicação para casos de uso;
- testes HTTP para contratos e validações;
- testes de persistência quando houver banco;
- poucos testes de ponta a ponta para fluxos críticos.

## Definition of Ready

Um item está preparado para uma Sprint quando:

- [ ] possui história ou objetivo compreensível;
- [ ] tem valor claro;
- [ ] possui critérios de aceitação verificáveis;
- [ ] dependências e dúvidas principais são conhecidas;
- [ ] está pequeno o suficiente para a Sprint;
- [ ] foi entendido e estimado pelos Developers.

A Definition of Ready é uma convenção da equipe, não um elemento obrigatório do Scrum.

## Definition of Done

- [ ] critérios de aceitação atendidos;
- [ ] trabalho realizado em branch própria;
- [ ] testes necessários criados e executados;
- [ ] nenhum erro conhecido impede o uso;
- [ ] documentação afetada atualizada;
- [ ] outro integrante revisou;
- [ ] comentários foram resolvidos;
- [ ] PR aprovada e integrada à `main`;
- [ ] resultado pode ser demonstrado.

## Checklist antes da PR

```powershell
.\mvnw.cmd test
git status
git diff --check
git diff main...HEAD
```

Na revisão, confirme escopo, clareza, comportamento, testes, riscos, segurança e documentação.
