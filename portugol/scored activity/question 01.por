programa {
  funcao inicio() {
    // variáveis
    real valorA, valorB, valorC, soma

    // solicitando dados
    escreva("Digite o valor de A: ")
    leia(valorA)

    escreva("Digite o valor de B: ")
    leia(valorB)

    escreva("Digite o valor de C: ")
    leia(valorC)

    // cálculos
    soma = valorA + valorB
    
    // exibindo resultados
    limpa()
    escreva("=== Exibindo resultados ===\n")
    se (soma < valorC) {
      escreva(soma," é menor que ", valorC)
    } senao {
      escreva(soma," é maior que ", valorC)
    }
  }
}
