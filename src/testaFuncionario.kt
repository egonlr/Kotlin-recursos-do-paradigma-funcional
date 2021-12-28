fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )
    println("\nFUNCIONÁRIO")
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val fran = Gerente(nome = "Fran", cpf = "222.111.111-11", salario = 2000.0, senha = 1234)

    println("\nGERENTE")
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticacao")
    }

    val gui = Diretor(
        nome = "Guilherme",
        cpf = "333.333.333-33",
        salario = 3000.0,
        senha = 3000,
        plr = 200.0
    )
    println("\nDIRETOR")
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")
    if (gui.autentica(3000)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticacao")

    }

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444.44",
        salario = 4000.0
    )

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificacao: ${calculadora.total}")
}