var estoque = mutableListOf<String>()

fun adicionarEstoque(){
    print("Digite o item que deseja estocar: ")
    val item = readln()
    if(item.isBlank()){
        println("Digite um produto válido")
    }
    else{
        estoque.add(item)
        println("O produto foi cadastradado")
    }

}

fun removerEstoque(){

    print("Digite o item que deseja remover: ")
    val item = readln()
    if(estoque.contains(item)){
        estoque.remove(item)
        println("Produto removido com sucesso")
    }
    else{
        println("Esse produto não existe no estoque")
    }

}

fun alterarEstoque(){
    print("Digite o item que deseja alterar: ")
    val item = readln()

    if(estoque.contains(item)){
        print("digite o novo nome ao item: ")
        val novoNome = readln()
        val index = estoque.indexOf(item)
        println("O index é: $index")
        estoque[index] = novoNome
        println("Produto alterado com sucesso")
    }
    else{
        println("Não existe esse item no estoque")
    }
}

fun exibirEstoque(){
    var codProdutos= 1
    if(estoque.size == 0){
        println("Não existem itens no estoque")
    }
    else{
       estoque.forEach{

           println("Produto $codProdutos: $it")
           codProdutos++
       }
    }
}