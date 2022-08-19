fun main(){
    
    while(true){
        println("Escolha uma das opções: ")
        println("[1] Adicionar ao estoque       [2] Remover do Estoque")
        println("[3] Alterar Estoque            [4] Exibir Estoque")
        print("[5] Finalizar programa \nEscolha uma opção: ")
        val opcao = readln().toInt()

        println()
        val escolha = when(opcao){
           1 -> adicionarEstoque()
           2 -> removerEstoque()
           3 -> alterarEstoque()
           4 -> exibirEstoque()
           5-> {
               println("Saindo...")
               break
           }
           else -> "Opção inválida"
       }
        println()
    }
}