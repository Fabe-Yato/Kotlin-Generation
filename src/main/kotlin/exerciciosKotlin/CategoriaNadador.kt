fun main(){

    /* Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
			categorias:
			Infantil A = 5 a 7 anos
			Infantil B = 8 a 11 anos
			Juvenil A = 12 a 13 anos
			Juvenil B = 14 a 17 anos
			Adultos = Maiores de 18 anos*/

    println("Digite a sua idade: ")
    val idade = readLine()!!.toInt()
    println("Idade: " + idade)

    if(idade >= 5 && idade <= 7){
        println("Sua categoria é: Nadador Infantil A")
    }
    else if(idade >= 8 && idade <= 11){
        println("Sua categoria é: Nadador Infantil B")
    }
    else if(idade >= 12 && idade <= 13){
        println("Sua categoria é: Nadador Juvenil A")
    }
    else if(idade >= 14 && idade <= 17){
        println("Sua categoria é: Nadador Juvenil B")
    }
    else if(idade >= 18 && idade < 100){
        println("Sua categoria é: Nadador Adulto")
    }
    else{
        println("Digite uma idade válida")
    }
}