package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val valdir = Gerente(
        nome = "Valdir Osni Santos",
        cpf = "083.111.555-18",
        salario = 5750.0,
        senha = "password5"
        )

    ImprimeRelatorioFuncionario.imprime(valdir)

    TesteAutenticacao().autentica(valdir)

}
