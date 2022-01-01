import br.com.egonlr.bytebank.modelo.ContaCorrente
import br.com.egonlr.bytebank.modelo.ContaPoupanca
import br.com.egonlr.bytebank.modelo.ContaSalario

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    val contaSalario = ContaSalario(
    titular = "Gui,",
    numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(3000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo salario: ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)
    println("Após saque")
    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo salario: ${contaSalario.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Após transferencia")
    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Após transferencia")
    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    //contaSalario.transfere(200.0, contaCorrente)  //br.com.egonlr.bytebank.modelo.Conta salario não é aceito tranferencia
}