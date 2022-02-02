package br.com.egonlr.bytebank

import br.com.egonlr.bytebank.exception.SaldoInsuficienteException
import testaComportamentosConta

fun main() {
    println("início main")

    testaComportamentosConta()
        println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException foi pega")
    }
    println("fim funcao1")
}

fun funcao2() {

    println("início funcao2")

    for (i in 1..5){
        println(i)
        throw SaldoInsuficienteException()
    }


    println("fim funcao2")
}
