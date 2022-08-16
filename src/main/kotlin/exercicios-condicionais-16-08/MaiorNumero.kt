fun main(){
    /*1- Faça um programa que receba três inteiros e
        diga qual deles é o maior.*/

    print("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    print("Digite o terceiro número: ")
    val num3 = readln().toInt()

    var numeroMaior = num1

    if(num2 > numeroMaior){
        numeroMaior = num2
    }
    if(num3 > numeroMaior){
        numeroMaior = num3
    }
    println("O maior número é: " + numeroMaior)
}