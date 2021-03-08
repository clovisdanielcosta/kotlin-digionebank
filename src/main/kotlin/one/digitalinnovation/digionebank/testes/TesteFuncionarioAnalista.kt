package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val sergio = Analista(
        nome = "Daniel Danny Dello",
        cpf = "123.527.287-25",
        salario = 1250.0
        )

    imprimeRelatorio(sergio)

}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())