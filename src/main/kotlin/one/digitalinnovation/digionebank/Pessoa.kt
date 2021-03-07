package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Daniel"
    var cpf: String = "999.999.888-00"

    inner class Endereco {
        var rua: String = "Rua dos Pardais"
    }
}

fun main() {
    val daniel = Pessoa()

    println(daniel.nome)
    println(daniel.cpf)
    println(daniel.Endereco().rua)

}