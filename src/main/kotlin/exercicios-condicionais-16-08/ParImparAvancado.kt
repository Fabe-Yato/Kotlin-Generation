fun main(){
    /*4- Faça um programa em que permita a entrada de um número qualquer
    e exiba se este número é par ou ímpar. Se for par exiba também a raiz
    quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/

    print("Digite um número qualquer: ")
    val numero = readln().toDouble()
    if(numero % 2.0 == 0.0){
        println("O numero $numero é par")
        println("Sua raiz quadrada é: ${"%.2f".format(Math.sqrt(numero))}")
    }
    else{
        println("O numero $numero é impar")
        println("O numero ao quadrado é: ${numero * numero}")
    }
}