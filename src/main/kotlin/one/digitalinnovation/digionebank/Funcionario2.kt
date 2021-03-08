package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Funcionario2 (

    nome: String,
    cpf: String,
    val salario: BigDecimal
) : Pessoa3(nome, cpf)