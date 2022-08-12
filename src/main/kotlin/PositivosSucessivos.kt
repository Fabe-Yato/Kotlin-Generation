fun main(){
    /*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
		apresente no final o total do somatório, a média e o total de valores lidos. O programa
		deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
		positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
		negativo.*/

        var numPositivo = 0; var soma = 0; var media = 0.0
        var total = 0
        while(numPositivo >= 0){

            println("Digite um número positivo: ")
            numPositivo = readLine()!!.toInt()
            if(numPositivo >= 0) {
                soma += numPositivo
                total++
            }

        }
        media = (soma / total)!!.toDouble()
        println("A soma de todos os números: " + soma)
        println("A média dos números: " + media)
}