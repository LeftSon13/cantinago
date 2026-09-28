const pedidosFicticios = {
    "CG-1001": "Recebido",
    "CG-1002": "Em preparo",
    "CG-1003": "Pronto"
};

const formulario = document.querySelector("form");
const campoCodigo = document.querySelector("#codigo-pedido");
const resultadoConsulta = document.querySelector("#resultado-consulta");
const listaCodigos = document.querySelector("#lista-codigos");

Object.keys(pedidosFicticios).forEach((codigo) => {
    const itemCodigo = document.createElement("li");
    itemCodigo.textContent = codigo;
    listaCodigos.appendChild(itemCodigo);
});

formulario.addEventListener("submit", (evento) => {
    evento.preventDefault();

    const codigo = campoCodigo.value.trim();

    if (!codigo) {
        resultadoConsulta.textContent = "Informe o código do pedido.";
        return;
    }

    const status = pedidosFicticios[codigo];

    if (!status) {
        resultadoConsulta.textContent = "Código de pedido não encontrado.";
        return;
    }

    resultadoConsulta.textContent = `Código: ${codigo} — Status: ${status}`;
});
