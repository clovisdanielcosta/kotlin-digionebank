package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val daniel = Pessoa()
    // daniel.cpf = "4578"

    println(daniel.nome)
    println(daniel.cpf)
    println(daniel.Endereco().rua)
    println(daniel.pessoaInfo())
}

