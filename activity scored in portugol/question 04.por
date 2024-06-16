programa {
  funcao inicio() {
    // variáveis
    real precoMorango, precoMaca, kgMorango, kgMaca, kgTotal, valorTotal

    // solicitando dados
    escreva("Quantos Kg de morangos você vai querer: ")
    leia(kgMorango)

    escreva("Quantos Kg de maçãs você vai querer: ")
    leia(kgMaca)

    // atribuindo valores
    se (kgMorango <=5) {
      precoMorango = kgMorango * 2.5
    } senao {
      precoMorango = kgMorango * 2.2
    }
    
    se (kgMaca <=5) {
      precoMaca = kgMaca * 1.8
    } senao {
      precoMaca = kgMaca * 1.5
    }
    
    kgTotal = kgMorango + kgMaca
    valorTotal = precoMaca + precoMorango

    // cálculos
    se (kgTotal >=8 ou valorTotal >=25) {
      valorTotal = valorTotal * 0.9
    } senao {
      valorTotal = valorTotal
    }

    // exibindo resulados
    limpa()
    escreva("=== Exibindo Resultados ===")
    escreva("\nValor à pagar: ",valorTotal)
  }
}
