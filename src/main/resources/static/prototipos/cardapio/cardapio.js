const produtos = [
    {
        nome: "Pão de queijo",
        descricao: "Porção com três unidades assadas.",
        preco: 5.0,
        icone: "🧀"
    },
    {
        nome: "Sanduíche natural",
        descricao: "Pão integral, queijo, alface e tomate.",
        preco: 9.5,
        icone: "🥪"
    },
    {
        nome: "Suco de laranja",
        descricao: "Copo de 300 ml servido gelado.",
        preco: 7.5,
        icone: "🍊"
    }
];

// O formatador mantém o padrão de moeda em um único lugar e evita montar preços manualmente.
const formatadorDePreco = new Intl.NumberFormat("pt-BR", {
    style: "currency",
    currency: "BRL"
});

const listaProdutos = document.querySelector("#lista-produtos");
const quantidadeProdutos = document.querySelector("#quantidade-produtos");

function criarCartaoDoProduto(produto) {
    const cartao = document.createElement("article");
    cartao.className = "produto";
    cartao.setAttribute("role", "listitem");

    const icone = document.createElement("span");
    icone.className = "produto__icone";
    icone.setAttribute("aria-hidden", "true");
    icone.textContent = produto.icone;

    const nome = document.createElement("h3");
    nome.textContent = produto.nome;

    const descricao = document.createElement("p");
    descricao.className = "produto__descricao";
    descricao.textContent = produto.descricao;

    const preco = document.createElement("p");
    preco.className = "produto__preco";
    preco.textContent = formatadorDePreco.format(produto.preco);

    cartao.append(icone, nome, descricao, preco);
    return cartao;
}

function renderizarProdutos() {
    const cartoes = produtos.map(criarCartaoDoProduto);
    listaProdutos.replaceChildren(...cartoes);

    const sufixo = produtos.length === 1 ? "produto" : "produtos";
    quantidadeProdutos.textContent = `${produtos.length} ${sufixo}`;
}

renderizarProdutos();
