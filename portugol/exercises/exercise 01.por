programa {
  funcao inicio() {
    // variaveis
    inteiro macas
    real custoDaMaca, desconto, custoTotal

    // solicitando dados
    escreva("Quantas maçãs você quer comprar: ")
    leia(macas)

    // calculos
    limpa()
    custoDaMaca = macas * 1.30 
    desconto = macas * 1.00
    
    escreva(macas," Maçãs")

    se (macas <12) {
      escreva("\nTotal a pagar: R$",custoDaMaca)
    } senao {
      escreva("\nTotal a pagar: R$",desconto)
    }
  }
}
