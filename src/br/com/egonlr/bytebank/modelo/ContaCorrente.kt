package br.com.egonlr.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int)
    : ContaTrasferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1

        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
    }