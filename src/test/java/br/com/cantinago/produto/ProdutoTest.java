package br.com.cantinago.produto;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Verifica a regra de preço do produto para que dados inválidos não sejam criados.
 */
class ProdutoTest {

    @Test
    void deveAceitarPrecoPositivo() {
        assertDoesNotThrow(() -> criarProduto(new BigDecimal("0.01")));
    }

    @Test
    void deveRejeitarPrecoNulo() {
        verificarPrecoInvalido(null);
    }

    @Test
    void deveRejeitarPrecoIgualAZero() {
        verificarPrecoInvalido(new BigDecimal("0.00"));
    }

    @Test
    void deveRejeitarPrecoNegativo() {
        verificarPrecoInvalido(new BigDecimal("-0.01"));
    }

    private void verificarPrecoInvalido(BigDecimal preco) {
        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> criarProduto(preco));

        assertEquals("O preço do produto deve ser maior que zero.", excecao.getMessage());
    }

    private Produto criarProduto(BigDecimal preco) {
        return new Produto(1L, "Pão de queijo", preco, true, true);
    }
}
