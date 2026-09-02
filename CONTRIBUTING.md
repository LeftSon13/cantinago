# Como contribuir com o CantinaGO

## Antes de começar

1. Leia o [guia da equipe](docs/GUIA_DA_EQUIPE.md) e o [fluxo Git/GitHub](docs/FLUXO_GIT_E_GITHUB.md).
2. Escolha uma Issue aprovada para a Sprint.
3. Confirme critérios de aceitação e dependências.
4. Atualize a `main` e crie a branch da Issue.

## Durante o trabalho

- permaneça no escopo da Issue;
- faça mudanças pequenas e compreensíveis;
- escreva ou atualize testes;
- peça ajuda ao identificar um bloqueio;
- não use dados sensíveis ou segredos;
- mantenha documentação e código coerentes.

## Convenções

Branches: `feat/12-descricao`, `fix/18-descricao`, `docs/21-descricao`, `chore/25-descricao`, `test/27-descricao` ou `refactor/30-descricao`.

Commits seguem prefixos como `feat:`, `fix:`, `docs:`, `test:`, `chore:` e `refactor:`.

## Validação

```powershell
.\mvnw.cmd test
git status
git diff --check
```

Confira também se arquivos de IDE, build, credenciais ou conteúdo sem relação entraram por engano.

## Pull Request

- vincule a Issue;
- descreva o que mudou e por quê;
- informe como validou;
- destaque riscos e pendências;
- informe se a documentação foi atualizada;
- solicite revisão de outro integrante.

O autor não aprova a própria PR. Mudanças solicitadas devem ser corrigidas ou discutidas na própria conversa da PR.

## Conclusão

A alteração só está concluída após aprovação, merge na `main`, fechamento da Issue e atualização do cartão correspondente. A [Definition of Done](docs/QUALIDADE_E_TESTES.md#definition-of-done) é obrigatória para o trabalho selecionado.
