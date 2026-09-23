package br.com.cantinago.produto;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ControladorProdutos {

    private final CatalogoProdutos catalogo;

    public ControladorProdutos(CatalogoProdutos catalogo) {
        this.catalogo = catalogo;
    }

    @GetMapping
    public List<ProdutoResposta> listarProdutosDisponiveis() {
        return catalogo.listarDisponiveis();
    }
}
