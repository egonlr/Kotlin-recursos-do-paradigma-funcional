package br.com.egonlr.bytebank.teste

import br.com.egonlr.bytebank.modelo.Endereco

fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    println(enderecoNulo?.logradouro?.length)
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
        teste("")
        teste(1)
    }
}

fun teste(valor: Any)
{
    val numero: Int? = valor as? Int
    println(numero)
}