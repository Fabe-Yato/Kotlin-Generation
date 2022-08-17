fun main(){
    /*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas
        com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa
        termina quando idade for =-99. (WHILE)*/

    var idade = 0; var menores21 = 0; var maiores50 = 0
    while(idade < 100){
        println("Digite uma idade: ")
        idade = readln().toInt()

        if(idade < 21){
            menores21 += 1
        }
        else if(idade > 50){
            maiores50 += 1
        }
    }
    println("Pessoas menores de 21 anos $menores21")
    println("Pessoas maiores de 50 anos $maiores50")
}