programa {
  funcao inicio() {
    // váriaveis
    real litros, litrosVendidos, gasolina, alcool, valorTotal, desconto
    caracter combustivel

    // solicitando dados
    escreva("\t\t\t\t\t\t\t=== TABELA ===")
    escreva("\nCombustíveis \t\t\tPreços \t\t\t\tDescontos")
    escreva("\nG-gasolina \t\t\t\tR$ 6,59 \t\t\tAté 25 litros, desconto de 3% por litro. Acima de 25 litros, desconto de 5% por litro")
    escreva("\nA-ácool \t\t\t\t\tR$ 3,79 \t\t\tAté 25 litros, desconto de 2% por litro. Acima de 25 litros, desconto de 4% por litro")
    
    escreva("\n\nDigite o tipo de combusível: ")
    leia(combustivel)

    escreva("Digite quantos litros você deseja: ")
    leia(litros)
    
    // declarando valores
    gasolina = 6.59
    alcool = 3.79

    // cálculos
    escolha (combustivel) {
      caso 'G':
      litrosVendidos = gasolina * litros
      se (litros <=25) {
      desconto = 0.03 * litrosVendidos 
      } senao {
      desconto = 0.05 * litrosVendidos 
      }
      valorTotal = litrosVendidos - desconto
      limpa()
      escreva("=== Exibindo resultados ===")
      escreva("\nPreço total a pagar: R$", valorTotal)
      pare

      caso 'A':
      litrosVendidos = alcool * litros
      se (litros <=25) {
      desconto = 0.02 * litrosVendidos
      } senao {
      desconto = 0.04 * litrosVendidos 
      }
      valorTotal = litrosVendidos - desconto
      limpa()
      escreva("=== Exibindo resultados ===")
      escreva("\nPreço total a pagar: R$", valorTotal)
      pare

      caso contrario:
      limpa()
      escreva("Combustivel não identificado!")
      pare
    } 
  }
}
