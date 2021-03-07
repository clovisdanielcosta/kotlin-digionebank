package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco( nome = "DigiOneBank", numero = 12) //argumentos nomeados

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}