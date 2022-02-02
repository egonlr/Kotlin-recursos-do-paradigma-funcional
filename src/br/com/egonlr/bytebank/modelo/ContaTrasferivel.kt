package br.com.egonlr.bytebank.modelo

import br.com.egonlr.bytebank.exception.FalhaAutenticacaoException
import br.com.egonlr.bytebank.exception.SaldoInsuficienteException

abstract class ContaTrasferivel (
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    fun transfere(valor: Double, destino: Conta, senha: Int): Boolean {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído $valor")
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
 //       throw NumberFormatException()
        saldo -= valor
        destino.deposita(valor)
        return true

        return false
    }
}