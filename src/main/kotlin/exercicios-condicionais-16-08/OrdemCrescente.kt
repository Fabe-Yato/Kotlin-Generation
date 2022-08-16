fun main(){
    /*2- Faça um programa que entre com três números e coloque
         em ordem crescente.*/

    print("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    print("Digite o terceiro número: ")
    val num3 = readln().toInt()

    var primeiro = 0; var segundo = 0; var terceiro = 0

    //verificar o primeiro número
    if(num1 < num2 && num1 < num3){
        primeiro = num1
    }
    else if(num2 < num1 && num2 < num3){
        primeiro = num2
    }
    else{
        primeiro = num3
    }

    //Verificar o terceiro número
    if(num1 > num2 && num1 > num3){
        terceiro = num1
    }
    else if(num2 > num1 && num2 > num3){
        terceiro = num2
    }
    else{
        terceiro = num3
    }

    //Verificar o segundo número
    if(num1 > primeiro && num1 < terceiro){
        segundo = num1
    }
    else if(num2 > primeiro && num2 < terceiro){
        segundo = num2
    }
    else{
        segundo = num3
    }

    println("A ordem é: " + primeiro + " " + segundo + " " + terceiro)
}