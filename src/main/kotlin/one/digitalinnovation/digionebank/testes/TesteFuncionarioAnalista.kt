package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val sergio = Analista(
        nome = "Daniel Danny Dello",
        cpf = "123.527.287-25",
        salario = 1250.0
        )

    ImprimeRelatorioFuncionario.imprime(sergio)

}
