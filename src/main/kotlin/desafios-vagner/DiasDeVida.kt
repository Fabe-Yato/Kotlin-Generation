fun main(){

    /*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a
    expressa apenas em dias. */
    print("Digite o seu dia de nascimento: ")
    val dia = readln().toInt()
    print("Digite o mês de nascimento em números: ")
    val mes = readln().toInt()
    print("Digite a sua idade: ")
    val idade = readln().toInt()

    var diasNascimento = (idade * 365) + ((mes) * 30) + dia
    print("Você tem " + diasNascimento + " dias de vida")
}