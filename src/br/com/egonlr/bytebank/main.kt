package br.com.egonlr.bytebank

import br.com.egonlr.bytebank.modelo.Autenticavel
import br.com.egonlr.bytebank.modelo.Endereco
import br.com.egonlr.bytebank.modelo.SistemaInterno
import br.com.egonlr.bytebank.teste.teste

fun main() {
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3146)
//    val endercoEmMaiuscula = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(endercoEmMaiuscula)

    Endereco(logradouro = "rua vergueiro", numero = 3146)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let (::println)

//    listOf(Endereco(complemento = "casa"),
//        Endereco(),
//        Endereco(complemento = "apartamentos"))
//        .filter { endereco -> endereco.complemento.isNotEmpty()  }
//        .let(::println)

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








