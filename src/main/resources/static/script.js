document.getElementById("formTarefa").addEventListener("submit", function(event) {
    event.preventDefault(); // Impede o envio do formulário e recarregamento da página

    // Captura os valores dos campos do formulário
    let titulo = document.getElementById("titulo").value;
    let descricao = document.getElementById("descricao").value;
    let dataVencimento = document.getElementById("data-vencimento").value;
    let status = document.getElementById("status").value;

    // Cria uma nova linha na tabela
    let tabela = document.getElementById("tabelaTarefas").getElementsByTagName('tbody')[0];
    let novaLinha = tabela.insertRow();

    // Cria as células e insere os valores
    let celulaTitulo = novaLinha.insertCell(0);
    let celulaDescricao = novaLinha.insertCell(1);
    let celulaDataVencimento = novaLinha.insertCell(2);
    let celulaStatus = novaLinha.insertCell(3);
    let celulaAcoes = novaLinha.insertCell(4); // Nova célula para ações

    celulaTitulo.textContent = titulo;
    celulaDescricao.textContent = descricao;
    celulaDataVencimento.textContent = dataVencimento;
    celulaStatus.textContent = status;

    // Adicionar um select box para ações
    let selectAcoes = document.createElement("select");
    let opcaoEditar = document.createElement("option");
    opcaoEditar.text = "Editar";
    let opcaoExcluir = document.createElement("option");
    opcaoExcluir.text = "Excluir";
    selectAcoes.add(opcaoEditar);
    selectAcoes.add(opcaoExcluir);
    
    // Event listener para quando uma opção é selecionada
    selectAcoes.addEventListener("change", function() {
        if (this.value === "Editar") {
            // Lógica de edição (preencher o formulário com os dados da linha)
            document.getElementById("titulo").value = titulo;
            document.getElementById("descricao").value = descricao;
            document.getElementById("data-vencimento").value = dataVencimento;
            document.getElementById("status").value = status;
            tabela.deleteRow(novaLinha.rowIndex); // Remove a linha da tabela
        } else if (this.value === "Excluir") {
            tabela.deleteRow(novaLinha.rowIndex); // Remove a linha da tabela
        }
    });

    celulaAcoes.appendChild(selectAcoes); // Adiciona o select box na célula de ações

    // Limpa os campos do formulário
    document.getElementById("formTarefa").reset();
});