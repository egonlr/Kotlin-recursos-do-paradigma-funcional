package br.com.egonlr.bytebank.modelo

class ContaPoupanca(
    titular: String,
    numero: Int
) : ContaTrasferivel(
    titular = titular,
    numero = numero) {

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
