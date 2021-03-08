package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal


fun main() {
    val daniel = Funcionario(
        nome = "Daniel Danny Dello",
        cpf = "123.527.287-25",
        salario = BigDecimal.valueOf(1250.0)
        )

    println(daniel.nome)
    println(daniel.cpf)
    println(daniel.salario)
}