fun main(){
    /*
        while(condição){
            executa uma tarefa
        }
    */

    /*var cont = 10
    while(cont >= 0){
        println("Contagem regressiva de : " + cont)
        cont --
    }
    println("BOOOOOOOM!!!")*/

    /*do{
        print("Tem o Pete e o Repete, o Pete morreu quem sobrou?: ")
        val resposta = readln()
    }while(resposta == "Repete")

    println("Você conseguiu sair da maldição do Repete")*/

    print("Número para calcular a tabuada: ")
    val tabuada = readln().toInt()
    var i = 0

    // for normal com ranges
    for(i in 1..10){
        println("$tabuada X $i = ${tabuada * i}")
    }
    var a = 10
    //DownT - for de forma decrescente
    for(a in 10 downTo 1){
        println("$tabuada X $a = ${tabuada * a}")
    }

    var b = 0
    //step - Quantidade de passos que entre o range
    for(b in 1..10 step 2){
        println("$tabuada X $b = ${tabuada * b}")
    }
    var c = 0
    //until - desconsidera o ultimo número do range
    for(c in 1 until 10 ){
        println("$tabuada X $b = ${tabuada * b}")
    }
}