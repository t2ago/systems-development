programa {
  funcao inicio() {
    // variáveis
    real cores

    // solicitando dados
    escreva("=== TABELA ===")
    escreva("\n1 - Verde")
    escreva("\n2 - Azul")
    escreva("\n3 - Amarelo")
    escreva("\n4 - Vermelho")
    escreva("\nEscolha uma cor de CD's: ")
    leia(cores)

    // exibindo resultados
    limpa()
    escreva("=== Exibindo resultados ===")
    escolha (cores) {
      caso 1:
      escreva("\nOs CD's verdes custam: R$ 10.00")
      pare
      caso 2:
      escreva("\nOs CD's azuis custam: R$ 20.00")
      pare
      caso 3:
      escreva("\nOs CD's amarelos custam R$ 30.00")
      pare
      caso 4:
      escreva("\nOs CD's vermelhos custam R$ 40.00")
      pare
    }
  }
}
