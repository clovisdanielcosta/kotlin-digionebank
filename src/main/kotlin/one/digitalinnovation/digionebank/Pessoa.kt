package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Danilo"
    var cpf: String = "999.999.888-00"
}

fun main() {
    val daniel = Pessoa()

    println(daniel.nome)
    println(daniel.cpf)
}