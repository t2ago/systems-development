programa {
  funcao inicio() {
    // Declarações de variáveis.
    cadeia aluno
    inteiro idade
    real primeiraNota, segundaNota, terceiraNota, quartaNota, media

    // Solicitando dados para o usuário.
    escreva("Digite seu nome: ")
    leia(aluno)

    escreva("Digite sua idade: ")
    leia(idade)

    escreva("Digite sua primeira nota: ")
    leia(primeiraNota)

    escreva("Digite sua segunda nota: ")
    leia(segundaNota)

    escreva("Digite sua terceira nota: ")
    leia(terceiraNota)

    escreva("Digite sua quarta nota: ")
    leia(quartaNota)

    // Realizar cálculos.
    media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4

    // Exibindo dados para o usuário.
    limpa()
    escreva("=== Exbindo resultados ===")
    escreva("\nNome do aluno: ", aluno)
    escreva("\nIdade do aluno: ", idade)
    escreva("\nPrimeira nota: ", primeiraNota)
    escreva("\nSegunda nota: ", segundaNota)
    escreva("\nTerceira nota: ", terceiraNota)
    escreva("\nQuarta nota: ", quartaNota)
    escreva("\nSua média é: ", media)
  }
}
