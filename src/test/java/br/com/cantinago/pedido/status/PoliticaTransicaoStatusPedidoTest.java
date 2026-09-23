package br.com.cantinago.pedido.status;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PoliticaTransicaoStatusPedidoTest {

    @Test
    void devePermitirTransicaoDeRecebidoParaEmPreparo() {
        boolean resultado = PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.RECEBIDO,
                StatusPedido.EM_PREPARO);

        assertTrue(resultado);
    }

    @Test
    void devePermitirTransicaoDeEmPreparoParaPronto() {
        boolean resultado = PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.EM_PREPARO,
                StatusPedido.PRONTO);

        assertTrue(resultado);
    }

    @Test
    void devePermitirTransicaoDeProntoParaEntregue() {
        boolean resultado = PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.PRONTO,
                StatusPedido.ENTREGUE);

        assertTrue(resultado);
    }

    @Test
    void devePermitirCancelamentoDeRecebidoConformeRn10() {
        boolean resultado = PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.RECEBIDO,
                StatusPedido.CANCELADO);

        assertTrue(resultado);
    }

    @Test
    void devePermitirCancelamentoDeEmPreparoConformeRn10() {
        boolean resultado = PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.EM_PREPARO,
                StatusPedido.CANCELADO);

        assertTrue(resultado);
    }

    @Test
    void devePermitirCancelamentoDeProntoConformeRn10() {
        boolean resultado = PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.PRONTO,
                StatusPedido.CANCELADO);

        assertTrue(resultado);
    }

    @Test
    void deveRejeitarSaltosDeEtapas() {
        assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.RECEBIDO,
                StatusPedido.PRONTO));

        assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.RECEBIDO,
                StatusPedido.ENTREGUE));

        assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.EM_PREPARO,
                StatusPedido.ENTREGUE));
    }

    @Test
    void deveRejeitarRetrocessos() {
        assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.EM_PREPARO,
                StatusPedido.RECEBIDO));

        assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.PRONTO,
                StatusPedido.EM_PREPARO));

        assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.PRONTO,
                StatusPedido.RECEBIDO));
    }

    @Test
    void deveRejeitarSaidasDeEstadosFinais() {
        for (StatusPedido proximoStatus : StatusPedido.values()) {
            assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                    StatusPedido.ENTREGUE,
                    proximoStatus));

            assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                    StatusPedido.CANCELADO,
                    proximoStatus));
        }
    }

    @Test
    void deveRejeitarRepeticaoDoMesmoStatus() {
        for (StatusPedido status : StatusPedido.values()) {
            assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                    status,
                    status));
        }
    }

    @Test
    void deveRejeitarEntradasNulasSemLancarExcecao() {
        assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                null,
                StatusPedido.EM_PREPARO));

        assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                StatusPedido.RECEBIDO,
                null));

        assertFalse(PoliticaTransicaoStatusPedido.podeTransicionar(
                null,
                null));
    }
}
