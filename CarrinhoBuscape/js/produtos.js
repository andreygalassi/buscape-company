
var carrinho=[];
$(document).ready(function(){
    var aProdutos = [];
    aProdutos = $.getJSON( "json/data.json", function() {
        aProdutos = aProdutos.responseJSON;
        atualizaTabela(aProdutos);
        selecionaLinha(aProdutos);
    });
    carrinho = JSON.parse(window.localStorage['carrinhoBuscape'] || '[]') ;
    $('#carrinho').text(carrinho.length);
});

function atualizaTabela(aProdutos){
    $('#tabela_corpo').r
    var aDados;

    for(i=0; i<aProdutos.items.length; i++) {
        var linha = "";
        var oDado = aProdutos.items[i];
        linha += '<tr id='+oDado.product.id+'>';
        linha += '<td><img src="'+oDado.product.images[0]+'" alt="'+oDado.product.name+'"  height="42" width="42">'+oDado.product.name+'</td>';
        linha += '<td>'+oDado.product.price.value+'</td>';
        linha += '</tr>';
        $('#tabela_corpo').append(linha);
    }

}

function selecionaLinha(aProdutos){
    $('table tbody tr').click(function(){
        var idSelecionado;
        idSelecionado=$(this).attr('id');
                    console.log(idSelecionado);
        if (idSelecionado!=null){
            for(i=0; i<aProdutos.items.length; i++) {
                if (aProdutos.items[i].product.id==idSelecionado){
                    console.log(aProdutos.items[i].product.id);
                    adicionarCarrinho(aProdutos.items[i].product);
                }
            }
        }
    });
}

function adicionarCarrinho(oProduto){
    carrinho = JSON.parse(window.localStorage['carrinhoBuscape'] || '[]') ;
    carrinho.push(oProduto);
    console.log(carrinho.length);
    window.localStorage['carrinhoBuscape'] = JSON.stringify(carrinho);
    $('#carrinho').text(carrinho.length);
}
function removerCarrinho(oProduto){
    carrinho.splice(oProduto);
    $('#carrinho').text(carrinho.length);
}