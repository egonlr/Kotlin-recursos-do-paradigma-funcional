import br.com.egonlr.bytebank.modelo.*

fun testaContasDiferentes() {

    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111.11",
        senha =1,
        endereco = Endereco("Rua Vergueiro")
    )



    val contaCorrente = ContaCorrente(titular = alex, numero = 1000)

    println("titular ${contaCorrente.titular.nome}")
    println("endereco ${contaCorrente.titular.endereco.logradouro}")

    val fran = Cliente(nome = "Fran", cpf="", senha = 1)
    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    val gui = Cliente(nome = "Gui", cpf = "", senha = 2)
    val contaSalario = ContaSalario(
    titular = gui,
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