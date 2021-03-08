package one.digitalinnovation.digionebank

class Pessoa2 {
    var nome: String = "Daniel"
    var cpf: String = "999.999.888-00"
    private set

    inner class Endereco {
        var rua: String = "Rua dos Pardais"
    }

    fun pessoaInfo() = "$nome e $cpf \nEndereço: ${Endereco().rua}"
}
