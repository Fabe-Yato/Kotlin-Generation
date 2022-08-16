fun main(){
    /*2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule
    a área e o perímetro dele*/

    println("Digite o valor do diametro do circulo: ")
    val diametro = readln().toDouble()
    val areaCirculo = 3.14 * (diametro/2) * (diametro/2)
    val perimetro = (3.14 * 2) * diametro

    println("A área do circulo é: " + areaCirculo+ " m2")
    println("O perimetro do circulo é: " +  Math.round(perimetro) + " m")
}