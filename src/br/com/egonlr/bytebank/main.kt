package br.com.egonlr.bytebank

fun main() {
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()
    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como lambda")
    }
    println((minhaFuncaoLambda()))
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como anonima")
    }
    println((minhaFuncaoAnonima()))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("Executa teste")
}

class Teste: () -> Unit {
    override fun invoke() {
        println("Executa invoke do Teste")

    }
}



