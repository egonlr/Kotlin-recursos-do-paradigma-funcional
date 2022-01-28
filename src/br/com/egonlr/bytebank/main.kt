import br.com.egonlr.bytebank.modelo.*
import br.com.egonlr.bytebank.teste.testaObjects


fun main() {

    testaFuncionarios()

    val endereco = Endereco()
    val objeto: Any = Any()

    imprime(objeto)
    imprime(1)
    imprime(1.0)
    imprime(endereco)
    val teste:Any = imprime(endereco)
    println(teste)
}

fun imprime(valor: Any) : Any {
    println(valor)
    return valor
}







