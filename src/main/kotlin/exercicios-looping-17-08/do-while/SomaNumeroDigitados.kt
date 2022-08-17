fun main(){
    /*5- Crie um programa que leia um número do teclado até que encontre um
        número igual a zero. No final, mostre a soma dos números
        digitados.(DO...WHILE)*/

    var soma = 0
    do{
        print("Digite um número para somar(Caso queira finalizar digite 0): ")
        var numeros = readln().toInt()
        soma += numeros
    }while(numeros != 0)
    println("A soma dos números digitados é: $soma")
}