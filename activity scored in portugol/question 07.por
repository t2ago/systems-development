programa {
  funcao inicio() {
    // variáveis
    cadeia nomeProduto
    inteiro quantidadeProduto
    real precoUnitario, precoTotal, desconto, precoFinal

    // solicitando dados
    escreva("Descrição do produto: ")
    leia(nomeProduto)

    escreva("Quantidade adquirida do produto: ")
    leia(quantidadeProduto)

    escreva("Preço unitário do produto: ")
    leia(precoUnitario)
    // declarando valores
    precoTotal = quantidadeProduto * precoUnitario

    // cálculos
    escolha (quantidadeProduto) {
    caso quantidadeProduto <=25:
    desconto = 0.02 * precoTotal
    pare
    caso quantidadeProduto >5 e quantidadeProduto <=10:
    desconto = 0.03 * precoTotal
    pare
    caso contrario:
    desconto = 0.05 * precoTotal
   }
    
    precoFinal = precoTotal - desconto

    // exibindo resultados
    limpa()
    escreva("=== Exibindo resultados ===")
    escreva("\nDescrição do produto: ",nomeProduto)
    escreva("\nQuantidade adquirida: ",quantidadeProduto)
    escreva("\nPreço unitário: ",precoUnitario)
    escreva("\nTotal à pagar: R$ ",precoFinal)
  }
}
