programa {
  funcao inicio() {
    // Declaração de variáveis.
    inteiro primeiroNumero, segundoNumero
    real media, soma, produto, menorValor, maiorValor

    // Solicitando dados para o usuário.
    escreva("Digite o primeiro número: ")
    leia(primeiroNumero)

    escreva("Digite o segundo número: ")
    leia(segundoNumero)

    // Realizar cálculos.
    media = (primeiroNumero + segundoNumero) / 2

    soma = primeiroNumero + segundoNumero

    produto = primeiroNumero * segundoNumero

    // Condições
    se (primeiroNumero > segundoNumero) {
      maiorValor = primeiroNumero
      menorValor = segundoNumero
    } 

    senao {
      maiorValor = segundoNumero
      menorValor = primeiroNumero
    }
   
    // Exibindo resultados.
    limpa()
    escreva("=== Exibindo resultados ===")
    escreva("\nMédia: ", media)
    escreva("\nSoma: ", soma)
    escreva("\nProduto: ", produto)
    escreva("\nMaior valor: ", maiorValor)
    escreva("\nMenor valor: ", menorValor)

    // Fim
  }
}
