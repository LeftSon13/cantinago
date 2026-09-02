# Fluxo Git e GitHub

## Fluxo oficial

```text
Trello/Product Backlog
        ↓
Issue refinada
        ↓
branch da atividade
        ↓
commits pequenos
        ↓
testes e revisão do autor
        ↓
Pull Request
        ↓
Code Review de outro integrante
        ↓
aprovação e merge commit
        ↓
Issue fechada e Trello atualizado
```

## Branches

Formato: `tipo/numero-descricao-curta`.

```text
feat/12-cadastrar-produto
fix/18-corrigir-total-pedido
docs/21-atualizar-guia-equipe
chore/25-configurar-ci
test/27-validar-pedido-vazio
refactor/30-separar-contrato-http
```

Crie a branch a partir da `main` atualizada.

## Commits

Use mensagens objetivas no imperativo:

```text
feat: adiciona consulta de produtos
fix: corrige cálculo do total
docs: explica fluxo de revisão
test: cobre pedido sem itens
chore: atualiza configuração Maven
refactor: separa resposta da entidade
```

Um commit deve contar uma parte coerente da história e não misturar correções sem relação.

## Pull Request

Inclua contexto, Issue, alterações, validação, riscos e impacto documental. Use `Closes #N` quando a PR concluir integralmente a Issue.

O autor deve revisar `Files changed` antes de solicitar review. O revisor pode comentar, aprovar ou solicitar mudanças. Discussões técnicas relevantes devem permanecer na PR.

## Merge

**[DECISÃO INICIAL]** Usar merge commit para preservar o commit da atividade e o registro explícito da PR. Confirmar aprovação, checks, ausência de conflitos e head esperado antes do merge.

Depois:

```powershell
git switch main
git pull --ff-only origin main
git branch -d nome-da-branch
```

Só exclua a branch depois de confirmar o merge. Não use exclusão forçada para esconder trabalho não integrado.

## Situações proibidas

- commits diretos na `main`;
- aprovar a própria PR;
- misturar várias Issues sem justificativa;
- enviar segredos, senhas ou arquivos pessoais;
- fazer merge com comentários obrigatórios pendentes;
- apagar histórico para corrigir um erro sem conversar com a equipe.
