# Visão do produto

## Origem

**[CONFIRMADO — CONTEXTO DA EQUIPE]** O CantinaGO nasceu em uma atividade de Metodologias Ágeis do Jovem Programador — SENAC. Além de construir um produto, a equipe pretende aprender Scrum, Kanban, Trello, GitHub, branches, Issues, Pull Requests e Code Review.

## Problema

**[PROPOSTA VALIDADA]** O atendimento tradicional de uma cantina pode gerar filas, demora, dificuldade para organizar pedidos e pouca visibilidade sobre o andamento do atendimento.

## Visão

**[PROPOSTA REGISTRADA NO BACKLOG]** Criar um sistema que permita ao cliente consultar o cardápio, montar um pedido e acompanhar seu status, enquanto funcionários da cantina organizam e atualizam os pedidos recebidos.

## Usuários iniciais

- **Cliente/aluno:** consulta produtos, realiza pedido e acompanha o status.
- **Funcionário da cantina:** visualiza pedidos e atualiza o atendimento.
- **Administrador:** hipótese futura para gerenciar produtos e permissões.

Os nomes, necessidades e permissões desses usuários devem ser refinados com a equipe antes da implementação.

## Objetivo do MVP

Entregar um fluxo demonstrável no qual:

1. o cliente consulta produtos disponíveis;
2. monta e confirma um pedido;
3. o funcionário visualiza o pedido recebido;
4. o funcionário atualiza o status;
5. o cliente acompanha o andamento.
6. CRUD de produtos

## Princípios

**[DECISÃO DE PROCESSO]**

1. Entregar incrementos pequenos e demonstráveis.
2. Todos participam de implementação, testes, revisão e documentação.
3. Requisitos devem ter critérios de aceitação verificáveis.
4. O código não entra na `main` sem revisão de outro integrante.
5. Ideias futuras não são compromissos do MVP.
6. A documentação deve refletir decisões reais, não suposições de uma IA.
7. O projeto deve ensinar o motivo do processo, não apenas produzir arquivos.

## Não objetivos atuais

- construir todas as funções de uma cantina na primeira versão;
- definir antecipadamente banco, frontend, autenticação, pagamentos ou implantação;
- dividir permanentemente a equipe por especialidade;
- tratar toda ideia do Trello como requisito aprovado;
- priorizar volume de funcionalidades em vez de um fluxo completo.

## Perguntas pendentes

- A primeira demonstração será para uma cantina real ou somente acadêmica? Uma demonstração em um estabelecimento real é o ideal - RESOLVIDO
- O cliente precisará de conta no MVP? No MVP não será necessário conta - RESOLVIDO
- Como o pedido será identificado e retirado? Para o sistema, utilizando um código hash, com ID único; para o usuário, através do nome de usuário - RESOLVIDO
- Haverá pagamento dentro do sistema ou somente pedido? Haverá a possibilidade de pagamento pelo sistema, para o cliente apenas retirar o produto no balcão - RESOLVIDO
- Quem poderá cadastrar produtos e alterar status? O funcionário / operador - RESOLVIDO
- Quais dados pessoais são realmente necessários? Nome, telefone, CPF (nota de venda) - RESOLVIDO
- Qual dispositivo será priorizado: celular, computador ou ambos? Celular é o mais presente para o usuário final; Para funcionário/operador o mais comum é computador ou tablet -
