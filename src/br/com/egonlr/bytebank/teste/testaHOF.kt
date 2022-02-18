package br.com.egonlr.bytebank.teste

import br.com.egonlr.bytebank.modelo.Autenticavel
import br.com.egonlr.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(1, 5, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234) {
        println("Realizar pagamento")
    }
}

fun soma(a: Int, b:Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}