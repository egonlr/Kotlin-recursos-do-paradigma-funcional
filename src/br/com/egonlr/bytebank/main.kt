package br.com.egonlr.bytebank

import br.com.egonlr.bytebank.modelo.Endereco
import br.com.egonlr.bytebank.teste.teste

fun main() {
    Endereco().let{

    }
    "".let(::testeRecebeString)

    1.let{

    }
    teste(1, {})
}

fun testeRecebeString(valor: String){

}
//higher order function (funçao que recebe funçao)
fun teste(teste: Int, bloco: () -> Unit) {

}







