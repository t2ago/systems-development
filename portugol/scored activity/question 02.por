programa {
  funcao inicio() {
    // variáveis
    cadeia nome, estadoCivil
    caracter sexo
    inteiro anosCasada

    // solicitando dados
    escreva("Seu nome: ")
    leia(nome)

    escreva("Sexo F ou M: ")
    leia(sexo)

    escreva("Estado civil: ")
    leia(estadoCivil)

    // cálculos
    limpa()
    se (sexo == 'f' ou 'F' e estadoCivil == "Casada" ou "CASADA" ou "casada") {
      escreva("Digite anos de casada: ")
      leia(anosCasada)
      
      limpa()
      escreva("=== Exibindo resultados ===")
      escreva("\nNome: ",nome)
      escreva("\nSexo: ",sexo)
      escreva("\nEstado civil: ",estadoCivil)
      escreva("\nAnos de casada: ",anosCasada)
    } senao {
      escreva("=== Exibindo resultados ===")
      escreva("\nNome: ",nome)
      escreva("\nSexo: ",sexo)
      escreva("\nEstado civil: ",estadoCivil)
    }
  }
}
