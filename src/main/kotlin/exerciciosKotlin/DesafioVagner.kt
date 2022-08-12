fun main(){
    println("Escolha uma estação: ")
    println("[0] Primavera    [1] Inverno")
    println("[2] Verão        [3] Outono")

    val estacoes = arrayOf("Primavera", "Inverno", "Verão", "Outono")
    val escolha = readLine()!!.toInt()

    val mes =  when(escolha){
        0 -> "A" + estacoes[0] +" vai de 21 de junho até 22 de setembro"
        1 -> "O " + estacoes[1] +" vai de 22 de setembro até 21 de dezembro"
        2 -> "O " + estacoes[2] +" vai de 21 de dezembro até 20 de março"
        3 -> "O " + estacoes[3] + " vai de 20 de março até 21 de junho"
        else -> "Opção inválida"
    }
    println(mes)


}