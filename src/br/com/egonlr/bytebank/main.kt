package br.com.egonlr.bytebank

import br.com.egonlr.bytebank.modelo.Autenticavel
import br.com.egonlr.bytebank.modelo.Endereco
import br.com.egonlr.bytebank.modelo.SistemaInterno

fun main() {
    with(Endereco()) {
        logradouro = "rua vegueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "apartamento"
        completo()
    }.let {endercoCompleto: String ->
        println(endercoCompleto)
    }

}











