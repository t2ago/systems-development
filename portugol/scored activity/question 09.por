programa {
  funcao inicio() {
    // variáveis
    real valorEmprestimo, rendaMensal, valorPrestacoes, valorMaxPrestacoes
    inteiro numPrestacoes

    // solicitando dados
    escreva("Digite sua renda mensal: ")
    leia(rendaMensal)

    escreva("Digite o valor do empréstimo: ")
    leia(valorEmprestimo)

    escreva("Digite o número de prestações: ")
    leia(numPrestacoes)

    // declarando valores
    valorPrestacoes = valorEmprestimo / numPrestacoes
    valorMaxPrestacoes = 0.3 * rendaMensal

    // exibindo resultados
    limpa()
    escreva("=== Exibindo resultados ===")
    escreva("\nRenda mensal: ",rendaMensal)
    escreva("\nValor do empréstimo: ",valorEmprestimo)
    escreva("\nNúmero de prestações: ",numPrestacoes)
    
    se (valorEmprestimo > 10 * rendaMensal ou valorPrestacoes > valorMaxPrestacoes) {
      escreva("\n- Empréstimo NÃO autorizado!")
    } senao {
      escreva("\n- Empréstimo autorizado! -")
    }
  }
}
