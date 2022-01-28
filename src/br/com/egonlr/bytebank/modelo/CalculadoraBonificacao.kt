package br.com.egonlr.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Any){
        if (funcionario is Funcionario) {
            this.total += funcionario.bonificacao
        }
    }

//    fun registra(gerente: br.com.egonlr.bytebank.modelo.Gerente){
//        this.total += gerente.bonificacao()
//    }
//
//    fun registra(diretor: br.com.egonlr.bytebank.modelo.Diretor){
//        this.total += diretor.bonificacao()
//    }
}