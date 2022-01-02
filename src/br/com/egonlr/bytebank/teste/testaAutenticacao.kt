import br.com.egonlr.bytebank.modelo.Cliente
import br.com.egonlr.bytebank.modelo.Diretor
import br.com.egonlr.bytebank.modelo.Gerente
import br.com.egonlr.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        "Egon",
        "111.111.111.11",
        1000.0,
        1000
    )
    val diretor = Diretor(
        "Pedro",
        "222.111.123.11",
        2000.0,
        2000,
        200.00
    )

    val cliente = Cliente("Egon", "777.777.777-77", senha = 1)

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2000)
    sistema.entra(cliente, 3000)


}