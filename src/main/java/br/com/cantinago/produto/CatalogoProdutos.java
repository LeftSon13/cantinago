package br.com.cantinago.produto;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CatalogoProdutos {

    private final List<Produto> produtos;

    public CatalogoProdutos() {
        this(List.of(
                new Produto(1L, "Pão de queijo", new BigDecimal("5.00"), true, true),
                new Produto(2L, "Suco de laranja", new BigDecimal("7.50"), true, true),
                new Produto(3L, "Produto inativo", new BigDecimal("4.00"), false, true),
                new Produto(4L, "Produto indisponível", new BigDecimal("6.00"), true, false)));
    }

    CatalogoProdutos(List<Produto> produtos) {
        this.produtos = List.copyOf(produtos);
    }

    /**
     * Filtra o catálogo e converte os produtos permitidos para a resposta da API.
     *
     * <p>Exemplos: um produto ativo e disponível entra na resposta; um produto
     * inativo ou indisponível é removido pelos filtros do {@code stream}.
     *
     * @return lista contendo somente produtos ativos e disponíveis
     */
    public List<ProdutoResposta> listarDisponiveis() {
        return produtos.stream()
                .filter(Produto::ativo)
                .filter(Produto::disponivel)
                .map(ProdutoResposta::de)
                .toList();
    }
}
