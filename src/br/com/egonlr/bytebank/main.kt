import br.com.egonlr.bytebank.modelo.*


fun main() {
//    val fran = object : Autenticavel{
//        val nome: String = "Fran"
//        val cpf: String = "111.111.111-11"
//        val senha: Int = 1000
//
//        override fun autentica(senha: Int) = this.senha == senha
//    }
//
//    println("nome do cliente: ${fran.nome}")
//    val sistemaInterno = SistemaInterno()
//    sistemaInterno.entra(fran, 1000)

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)

    println("Total de contas:  ${Conta.total}")

}






