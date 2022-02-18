package br.com.egonlr.bytebank.teste

import br.com.egonlr.bytebank.modelo.Endereco

fun testaFuncoesEscope() {
    //    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3146)
//    val endercoEmMaiuscula = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(endercoEmMaiuscula)

    run {
        println("Execução do run sem extensão")
    }

    val endereco = Endereco()
        .also {
            println("Criando endereço")
        }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3146
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let(::println)

//    listOf(Endereco(complemento = "casa"),
//        Endereco(),
//        Endereco(complemento = "apartamentos"))
//        .filter( predicate = { endereco -> endereco.complemento.isNotEmpty()  })
//        .let(block = (::println))'
}