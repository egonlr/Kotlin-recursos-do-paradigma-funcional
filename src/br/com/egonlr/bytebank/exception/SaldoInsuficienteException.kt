package br.com.egonlr.bytebank.exception

class SaldoInsuficienteException(mensagem: String = "O saldo é insuficiente") : Exception(mensagem)