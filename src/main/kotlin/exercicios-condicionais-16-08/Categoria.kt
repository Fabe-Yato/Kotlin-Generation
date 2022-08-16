fun main(){
    /*3- Faça um programa que receba a idade de uma pessoa e mostre na saída
    em qual categoria ela se encontra:
             10-14 infantil
             15-17 juvenil
             18-25 adulto*/

    print("Digite uma idade entre 10 a 25 anos: ")
    val idade = readln().toInt()

    val categoria = when(idade){
        in 10..14 -> "Sua categoria é infantil"
        in 15..17 -> "Sua categoria é juvenil"
        in 18..25 -> "Sua categoria é adulto"
        else -> "Idade inválida"
    }
    println(categoria)
}