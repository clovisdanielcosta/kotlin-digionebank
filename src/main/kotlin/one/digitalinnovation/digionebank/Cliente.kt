package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val tipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean = "123879" == senha

    override fun toString(): String = """
        Nome:           $nome
        Cpf:            $cpf
        Cliente Tipo:   ${tipo.descricao}
    """.trimIndent()
}