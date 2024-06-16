programa {
  funcao inicio() {
    // variáveis
    inteiro primeiroNumero, segundoNumero, terceiroNumero, maiorNumero, menorNumero

    // solicitando dados
    escreva("Digite o primeiro número: ")
    leia(primeiroNumero)
    
    escreva("Digite o segundo número: ")
    leia(segundoNumero)

    escreva("Digite o terceiro número: ")
    leia(terceiroNumero)

    // Verificando
    se (primeiroNumero > segundoNumero e primeiroNumero > terceiroNumero) {
      maiorNumero = primeiroNumero
    } senao se (segundoNumero > primeiroNumero e segundoNumero > terceiroNumero) {
      maiorNumero = segundoNumero 
    } senao {
      maiorNumero = terceiroNumero
    }

    se (primeiroNumero < segundoNumero e primeiroNumero < terceiroNumero) {
      menorNumero = primeiroNumero
    } senao se (segundoNumero < primeiroNumero e segundoNumero < terceiroNumero) {
      menorNumero = segundoNumero
    } senao {
      menorNumero = terceiroNumero
    }

    // exibindo resultados
    limpa()
    escreva("Primeiro número: ", primeiroNumero)

    escreva("\nSegundo número: ", segundoNumero)

    escreva("\nTerceiro número: ", terceiroNumero)

    escreva("\nMaior valor: ", maiorNumero)

    escreva("\nMenor valor: ", menorNumero)

    
  }
}
