fun main(){
    /*1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.*/

    print("Digite a sua idade: ")
    val idadeUsuario = readln().toInt()
    val anoNascimento = 2022 - idadeUsuario

    println("Você nasceu em " + anoNascimento)

}