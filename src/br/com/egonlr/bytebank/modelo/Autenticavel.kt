package br.com.egonlr.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}