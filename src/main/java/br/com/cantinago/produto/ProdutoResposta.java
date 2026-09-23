package br.com.cantinago.produto;

import java.math.BigDecimal;

/**
 * Define somente os dados que a API pode devolver ao cliente.
 *
 * <p>Ponto de estudo: separar a resposta do modelo interno evita expor campos
 * como {@code ativo} e {@code disponivel} sem necessidade.
 *
 * <p>Exemplo do JSON produzido pelo Spring:
 *
 * <pre>{@code
 * {
 *   "id": 1,
 *   "nome": "Pão de queijo",
 *   "preco": 5.00
 * }
 * }</pre>
 */
public record ProdutoResposta(
        Long id,
        String nome,
        BigDecimal preco) {

    static ProdutoResposta de(Produto produto) {
        return new ProdutoResposta(produto.id(), produto.nome(), produto.preco());
    }
}
