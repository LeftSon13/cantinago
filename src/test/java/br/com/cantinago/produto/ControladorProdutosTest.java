package br.com.cantinago.produto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Demonstra como testar o contrato HTTP do controlador sem abrir um servidor real.
 *
 * <p>Ponto de estudo: o {@link MockMvc} simula a requisição e permite organizar
 * cada teste em três partes: dado um cenário, quando ocorre a chamada e então
 * verificamos status, tipo de conteúdo e JSON retornado.
 */
class ControladorProdutosTest {

    @Test
    void deveRetornarSomenteProdutosAtivosEDisponiveis() throws Exception {
        MockMvc simuladorHttp = criarSimuladorHttp(new CatalogoProdutos());

        simuladorHttp.perform(get("/api/produtos"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().json("""
                        [
                          {"id": 1, "nome": "Pão de queijo", "preco": 5.00},
                          {"id": 2, "nome": "Suco de laranja", "preco": 7.50}
                        ]
                        """));
    }

    @Test
    void deveRetornarArrayVazioQuandoCatalogoEstiverVazio() throws Exception {
        MockMvc simuladorHttp = criarSimuladorHttp(new CatalogoProdutos(List.of()));

        simuladorHttp.perform(get("/api/produtos"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
    }

    private MockMvc criarSimuladorHttp(CatalogoProdutos catalogo) {
        return MockMvcBuilders
                .standaloneSetup(new ControladorProdutos(catalogo))
                .build();
    }
}
