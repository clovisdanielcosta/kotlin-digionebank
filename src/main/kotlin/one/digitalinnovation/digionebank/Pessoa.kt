package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Daniel"
    var cpf: String = "999.999.888-00"
    private set

    inner class Endereco {
        var rua: String = "Rua dos Pardais"
    }

    fun pessoaInfo() = "$nome e $cpf \nEndereço: ${Endereco().rua}"
}

fun main() {
    val daniel = Pessoa()
   // daniel.cpf = "4578"

    println(daniel.nome)
    println(daniel.cpf)
    println(daniel.Endereco().rua)
    println(daniel.pessoaInfo())

}