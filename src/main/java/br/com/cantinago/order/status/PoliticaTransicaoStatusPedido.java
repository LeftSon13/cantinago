package br.com.cantinago.order.status;

public final class PoliticaTransicaoStatusPedido {

    private PoliticaTransicaoStatusPedido() {
    }

    /**
     * Verifica se a mudança entre dois status de pedido é permitida.
     *
     * <p>
     * Retorna {@code false} quando algum status é {@code null},
     * quando os dois status são iguais ou quando a transição não está permitida.
     *
     * <p>
     * As transições para {@link StatusPedido#CANCELADO} implementam a proposta
     * RN10 e precisam de validação do Product Owner antes do merge.
     *
     * @param statusAtual   status atual do pedido
     * @param proximoStatus status para o qual se deseja avançar
     * @return {@code true} quando a transição é permitida; caso contrário,
     *         {@code false}
     */
    public static boolean podeTransicionar(
            StatusPedido statusAtual,
            StatusPedido proximoStatus) {
        return (statusAtual == StatusPedido.RECEBIDO
                && proximoStatus == StatusPedido.EM_PREPARO)
                || (statusAtual == StatusPedido.EM_PREPARO
                        && proximoStatus == StatusPedido.PRONTO)
                || (statusAtual == StatusPedido.PRONTO
                        && proximoStatus == StatusPedido.ENTREGUE)
                || (proximoStatus == StatusPedido.CANCELADO
                        && (statusAtual == StatusPedido.RECEBIDO
                                || statusAtual == StatusPedido.EM_PREPARO
                                || statusAtual == StatusPedido.PRONTO));
    }
}
