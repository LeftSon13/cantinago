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

### Idioma do código

- use português brasileiro nos nomes criados pelo projeto, incluindo pacotes, classes, métodos, variáveis e testes;
- escreva identificadores sem acentos ou cedilha para manter compatibilidade com as ferramentas;
- use português brasileiro também nos contratos criados pelo CantinaGO, incluindo rotas e campos JSON;
- preserve nomes exigidos por bibliotecas e sufixos reconhecidos pelas ferramentas, como `Test`;
- preserve somente os termos técnicos impostos pelas linguagens, protocolos, bibliotecas e ferramentas utilizadas.

### Comentários e exemplos didáticos

- use JavaDoc curto quando uma classe ou método apresentar conceito, contrato ou decisão não óbvia relevante para o estudo;
- inclua exemplos pequenos somente quando ajudarem a compreender o comportamento;
- explique principalmente o motivo ou o efeito relevante, sem repetir cada linha do código;
- não comente construções evidentes apenas para aumentar a quantidade de documentação;
- atualize ou remova comentários quando o código mudar, pois comentário desatualizado também é defeito.

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
- solicite revisão de todos os outros integrantes ativos da equipe.

### Revisão coletiva

- a PR pode ser publicada assim que o autor considerar o trabalho pronto para revisão, sem autorização prévia dos demais;
- todos os integrantes ativos são convidados a acompanhar as PRs abertas e revisar conforme sua disponibilidade;
- a revisão pode ser um comentário, uma aprovação ou uma solicitação de alterações;
- qualquer integrante que não seja o autor pode aprovar;
- pelo menos uma aprovação de outro integrante é obrigatória para o merge;
- revisões ainda não realizadas pelos demais integrantes não bloqueiam o andamento depois que a aprovação obrigatória foi obtida;
- o autor não aprova a própria PR;
- mudanças solicitadas devem ser corrigidas ou discutidas na própria conversa da PR.

## Conclusão

A alteração só está concluída após aprovação, merge na `main`, fechamento da Issue e atualização do cartão correspondente. A [Definition of Done](docs/QUALIDADE_E_TESTES.md#definition-of-done) é obrigatória para o trabalho selecionado.
