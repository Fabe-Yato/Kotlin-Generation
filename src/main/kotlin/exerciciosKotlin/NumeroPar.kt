fun main(){
    /* Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
	   número é par ou ímpar, e se é positivo ou negativo.*/

    println("Digite um número: ")
    val num = readLine()!!.toInt()
    if(num % 2 == 0){
        println("O número "+ num +" é par")
    }
    else{
        println("O número " + num + " é impar")
    }
    if(num > 0){
        println("O número " + num + " é positivo")
    }
    else{
        println("O número " + num +" é negativo")
    }
}


