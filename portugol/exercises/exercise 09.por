programa {
  funcao inicio() {
    real valor, desconto, totalApagar
    cadeia formaDePagamento
    inteiro opcao, parcelas

    escreva("Valor do produto: ")
    leia(valor)

    limpa()
    escreva("Valor: R$ ",valor)
    escreva("\n1 - Pagamento à vista")
    escreva("\n2 - Pagamento à prazo")
    escreva("\n\nEscolha o método de pagamento: ")
    leia(opcao)

    escolha(opcao) {
      caso 1:
      totalApagar = valor * 0.9 
      formaDePagamento = "À vista"
      desconto = valor - totalApagar

      caso 2:
      totalApagar = valor / parcelas
      formaDePagamento = "À prazo"

    }
    limpa()
    escreva("=== Exibindo resultados ===")
    escreva("\nValor do produto: R$ ",valor)
    escreva("\nForma de pagamento: ",formaDePagamento)
    escreva("\nValor do desconto: ",desconto)
    escreva("\nTotal à pagar: ",totalApagar)
  }
}
