package br.com.egonlr.bytebank.modelo

abstract class ContaTrasferivel (
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}