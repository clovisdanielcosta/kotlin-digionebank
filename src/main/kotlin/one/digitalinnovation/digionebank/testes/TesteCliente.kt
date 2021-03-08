package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    val maria = Cliente(
        nome = "Maria Rodrigues Pereira",
        cpf = "187.997.887-97",
        tipo = ClienteTipo.PF,
        senha = "123879"
    )

    println(maria)

    TesteAutenticacao().autentica(maria)
}