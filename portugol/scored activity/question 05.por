programa {
  funcao inicio() {
    // variáveis
    inteiro valorA, valorB
    real valorC, soma, subtracao, mutiplicacao, divisao
    caracter operacao

    // solicitando dados
    escreva("Digite o valor A: ")
    leia(valorA)

    escreva("Digite o valor B: ")
    leia(valorB)
    
    escreva("Digite a operação: ")
    leia(operacao)
    
    // declarando valores
    soma = valorA + valorB
    subtracao = valorA - valorB
    mutiplicacao = valorA * valorB
    divisao = valorA / valorB

    // cálculos
    se (operacao == '+') {
      valorC = soma
    }

    se (operacao == '-') {
      valorC = subtracao
    }

    se (operacao == '*') {
      valorC = mutiplicacao
    }

    se (operacao == '/') {
      valorC = divisao
    }

    // exibindo resultados
    limpa()
    escreva("=== Exibindo resultados ===")
    escreva("\nResultado: ",valorC)
  }
}
