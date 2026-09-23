package br.com.cantinago.produto;

import java.math.BigDecimal;

/**
 * Representa os dados internos completos de um produto.
 *
 * <p>Ponto de estudo: um {@code record} é adequado para agrupar dados e gera
 * automaticamente construtor e métodos de acesso, como {@code nome()}.
 *
 * <p>Exemplo de um produto ativo e disponível:
 *
 * <pre>{@code
 * new Produto(1L, "Pão de queijo", new BigDecimal("5.00"), true, true);
 * }</pre>
 */
record Produto(
        Long id,
        String nome,
        BigDecimal preco,
        boolean ativo,
        boolean disponivel) {
}
