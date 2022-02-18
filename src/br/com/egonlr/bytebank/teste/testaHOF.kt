package br.com.egonlr.bytebank.teste

import br.com.egonlr.bytebank.modelo.Autenticavel
import br.com.egonlr.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(1, 5, resultado = {valor ->
        println(valor)

    })
    somaReceiver(1,5, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 1234) {
        println("Realizar pagamento")
    }
    sistema.entraReceiver(autenticavel, 1234, autenticado = {
        pagamento()
    })
}

fun soma(a: Int, b:Int, resultado: (Int) -> Unit) {
    println("Soma: ")
    resultado(a + b)
}

fun somaReceiver (a: Int, b: Int, resultado: Int.() -> Unit) {
    println("Soma: ")
    val total = a + b
    total.resultado()
}