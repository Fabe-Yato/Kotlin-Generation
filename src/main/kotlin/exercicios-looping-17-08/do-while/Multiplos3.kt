fun main(){
    /*6- Escrever um programa que receba vários números inteiros no teclado. E no
        final imprimir a média dos números múltiplos de 3. Para sair digitar
        0(zero).(DO...WHILE)*/
    var mediaMultiplos3 = 0; var multiplos3 = 0; var contadorNumeros = 0
    do{
        println("Digite um número: ")
        var numeros = readln().toInt()
        if(numeros % 3 == 0){
            multiplos3++
        }
        contadorNumeros++
    }while(numeros != 0)
    mediaMultiplos3 = contadorNumeros / multiplos3
    println("Média dos multiplos de 3: $mediaMultiplos3")
}