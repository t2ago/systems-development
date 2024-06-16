programa {
  funcao inicio() {
    caracter sexo
    real peso, altura
    escreva("Digite seu sexo: ")
    leia(sexo)
    escreva("Digite sua altura: ")
    leia(altura)
    
    limpa()
    escolha (sexo) {
    caso 'M': 
    peso = (72.7 * altura) - 58
    escreva("=== Exibindo Resultados ===")
    escreva("\nSeu peso ideal é: ",peso)
    pare
    caso 'F':
    peso = (62.1 * altura) - 44.7
    escreva("=== Exibindo Resultados ===")
    escreva("\nSeu peso ideal é: ",peso)
    pare
    caso contrario:
    escreva("Sexo indefinido")
    }
  }
}
