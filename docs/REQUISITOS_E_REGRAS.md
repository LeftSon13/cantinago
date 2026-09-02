# Requisitos e regras de negócio

## Como usar este documento

Este é um catálogo inicial, não uma autorização automática para implementar. Cada item selecionado deve gerar ou estar vinculado a uma Issue com critérios de aceitação atualizados.

## Requisitos funcionais propostos

- **RF01:** apresentar produtos disponíveis com nome e preço.
- **RF02:** permitir adicionar, alterar quantidade e remover itens do carrinho.
- **RF03:** apresentar resumo e total antes da confirmação.
- **RF04:** registrar pedido confirmado e gerar identificação.
- **RF05:** listar pedidos recebidos para o funcionário.
- **RF06:** permitir atualização controlada do status.
- **RF07:** permitir ao cliente consultar o andamento do pedido.

## Regras propostas para refinamento

### Produtos

- **RN01:** somente produtos ativos e disponíveis aparecem no cardápio.
- **RN02:** produto possui nome, preço válido e disponibilidade.
- **RN03:** preço deve ser maior que zero.

### Pedidos

- **RN04:** pedido possui pelo menos um item.
- **RN05:** quantidade de cada item é maior que zero.
- **RN06:** total é a soma de preço multiplicado por quantidade.
- **RN07:** pedido confirmado recebe código único.
- **RN08:** novo pedido começa como `Recebido`.
- **RN09:** fluxo normal proposto: `Recebido → Em preparo → Pronto → Entregue`.
- **RN10:** cancelamento é permitido somente antes da entrega.
- **RN11:** pedidos entregues ou cancelados são finalizados.

### Permissões e evolução

- **RN12:** somente funcionário ou administrador altera o status.
- **RN13:** somente administrador gerencia produtos.
- **RN14:** estoque não pode ficar negativo.
- **RN15:** somente pedidos concluídos entram em relatórios de vendas.

## Modelo para novos requisitos

```markdown
## RF/RN-XX — Nome

Estado: Proposto | Aprovado | Implementado | Removido
Motivação:
Descrição:
Critérios de aceitação:
Issue relacionada:
Dependências:
Exceções:
```

## Pendências de negócio

- confirmar os estados e transições do pedido;
- definir como produtos ficam indisponíveis;
- decidir se preço é congelado no momento do pedido;
- definir cancelamento, retirada e identificação do cliente;
- decidir se estoque e autenticação pertencem ao MVP.
