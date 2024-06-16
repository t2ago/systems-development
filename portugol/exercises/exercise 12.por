programa {
  funcao inicio() {
    // Declaração de variáveis.
    real base, altura, area

    // Solicitando dados para o usuário.
    escreva("Digite a base do triângulo: ")
    leia(base)

    escreva("\nDigite a altura do triângulo: ")
    leia(altura)

    // Realizar cálculos.
    area = (base * altura) / 2

    // Exibindo os resultados para o usuário.
    limpa()
    escreva("=== Exibindo resultados ===")
    escreva("\nBase: ", base)
    escreva("\nAltura: ", altura)
    escreva("\nA aréa do triângulo é: ", area)
  }
}
