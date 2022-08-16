fun main() {
    println("Digite a vida do personagem: ")
    val vida = readln().toInt()
    if(vida <= 10 && vida > 7){
        println("Você está ótimo")
    }
    else if(vida <= 7 && vida > 5){
        println("Você está bem")
    }
    else if(vida <= 5 && vida > 0){
        println("Você está morrendo")
    }
    else if(vida <= 0){
        println("Você está morto")
    }
}