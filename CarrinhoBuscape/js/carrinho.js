
var carrinhoBuscape=[];
$(document).ready(function(){
    var aProdutos = [];
    carrinhoBuscape = JSON.parse(window.localStorage['carrinhoBuscape'] || '[]') ;
    atualizaTabela(carrinhoBuscape);
    $('#carrinho').text(carrinhoBuscape.length);

});

function atualizaTabela(aProdutos){
    var aDados;

    for(i=0; i<aProdutos.length; i++) {
        var oDado = aProdutos[i];
        var linha = "";
        linha += '<tr id='+oDado.id+'>';
        linha += '<td><img src="'+oDado.images[0]+'" alt="'+oDado.name+'"  height="42" width="42">'+oDado.name+'</td>';
        linha += '<td>'+oDado.price.value+'</td>';
        linha += '<td><button onclick="removerCarrinho('+oDado.id+')" >Remover</button></td>';
        linha += '</tr>';
    console.log(oDado.id);
        $('#tabela_corpo').append(linha);
    }

}

function removerCarrinho(idProduto){
    for(i=0; i<carrinhoBuscape.length; i++) {
        if (carrinhoBuscape[i].id==idProduto){
            carrinhoBuscape.splice(i,1);
            $('#carrinho').text(carrinhoBuscape.length);
            window.localStorage['carrinhoBuscape'] = JSON.stringify(carrinhoBuscape);
            window.location.href="carrinho.html"; 
            break;
        }
    }

}