package br.com.egonlr.bytebank

import br.com.egonlr.bytebank.modelo.*

fun main() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234), 1000)
    contaPoupanca.run {
            deposita(1000.0)
            saldo * taxaMensal
        }.let {rendimentoMensal ->
            println("Rendimento mensal: $rendimentoMensal")
        }

    val rendimentoAnual = run {
        var saldo: Double = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Rendimento anual: $rendimentoAnual")

}

fun testaWith() {
    with(Endereco()) {
        logradouro = "rua vegueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "apartamento"
        completo()
    }.let { endercoCompleto: String ->
        println(endercoCompleto)
    }
}











