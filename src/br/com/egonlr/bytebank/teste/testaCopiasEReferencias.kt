import br.com.egonlr.bytebank.modelo.Cliente
import br.com.egonlr.bytebank.modelo.ContaCorrente
import br.com.egonlr.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf="", senha=1)
    val contaJoao = ContaCorrente(titular = joao, numero = 1002)

    val maria = Cliente(nome = "Maria", cpf="", senha=1)
    var contaMaria = ContaPoupanca(titular = maria, numero = 1003)

    println("titular conta joao: ${contaJoao.titular.nome}")
    println("titular conta maria: ${contaMaria.titular.nome}")

    println(contaJoao)
    println(contaMaria)
}