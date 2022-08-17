fun main(){

    /*2- Ler 10 números e imprimir quantos são pares e quantos
    são ímpares. (FOR)*/
    
    var i = 0; var pares = 0; var impares = 0
    for(i in 1..10){
        print("Digite o número $i: ")
        var numeros = readln().toInt()

        if(numeros % 2 == 0){
            println("Esse número é par")
            pares += 1
        }
        else{
            println("Esse número é impar")
            impares += 1
        }
    }
    println("Pares: $pares")
    println("Impares: $impares")
}