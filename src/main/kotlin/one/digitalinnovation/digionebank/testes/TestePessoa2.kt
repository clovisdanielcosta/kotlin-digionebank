package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa2

fun main() {
    val daniel = Pessoa2()
    // daniel.cpf = "4578"

    println(daniel.nome)
    println(daniel.cpf)
    println(daniel.Endereco().rua)
    println(daniel.pessoaInfo())
}

