programa {
  funcao inicio() {
    // Delcaração de variáveis.
    real primeiroNumero, segundoNumero
    real soma, subtracao, mutiplicacao, divisao
   
    // Solicitando dados para o usuário.
    escreva("Digite o primeiro número: ")
    leia(primeiroNumero)

    escreva("Digite o segundo número: ")
    leia(segundoNumero)

    // Realizar cálculos.
    soma = primeiroNumero + segundoNumero
    subtracao = primeiroNumero - segundoNumero
    mutiplicacao = primeiroNumero * segundoNumero
    divisao = primeiroNumero / segundoNumero
    
    // Exibindo resultados para o usuário.
    limpa()
    escreva("=== Exibindo resultados ===")
    escreva("\nPrimeiro número: ", primeiroNumero)
    escreva("\nSegundo número: ", segundoNumero)
    escreva("\nSoma: ", soma)
    escreva("\nSubtração: ", subtracao)
    escreva("\nMutiplicação: ", mutiplicacao)
    escreva("\nDivisão: ", divisao)
  }
}
