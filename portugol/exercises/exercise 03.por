programa {
  funcao inicio() {
    // Declaração de variáveis
    cadeia aluno
    inteiro idade
    real primeiraNota, segundaNota, terceiraNota, media

    // Solicitando dados para o usuário.
    escreva("Digite seu nome: ")
    leia(aluno)

    escreva("Digite sua idade: ")
    leia(idade)

    escreva("Digite a primeira nota: ")
    leia(primeiraNota)

    escreva("Digite a segunda nota: ")
    leia(segundaNota)

    escreva("Digite a terceira nota: ")
    leia(terceiraNota)

    // Realizar cálculos.
    media = (primeiraNota + segundaNota + terceiraNota) / 3

    // Exibindo dados para o usuário.
    limpa()
    escreva("=== Exibindo resultados ===")
    escreva("\nNome do aluno: ", aluno)
    escreva("\nIdade do aluno: ", idade)
    //escreva("\nPrimeira nota: ", primeiraNota)
    //escreva("\nSegunda nota: ", segundaNota)
    //escreva("\nTerceira nota: ", terceiraNota)
    escreva("\nSua média é: ", media)

    // Condições
    se (media >=7) { 
      escreva("\nO aluno está aprovado!")
    }

    senao {
      escreva("\nO aluno está reprovado!")
    }

    // Fim
  }
}
