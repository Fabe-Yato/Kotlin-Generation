fun main(){
    /*  Faça um programa que pegue um número do teclado e calcule a soma de todos os
		números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
		1+2+3+4+5+6+7=28.*/

        println("Digite um número: ")
        val num = readLine()!!.toInt()
        var cont = 0; var soma = 0

        do{
            soma += cont
            cont++
        }while(cont <= num)
        println("A soma de todos os números é: " + soma)
}