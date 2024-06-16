programa {
  funcao inicio() {
    // variáveis
    real primeiraNota, segundaNota, media
    cadeia aluno

    // solicitando dados
    escreva("Nome do aluno: ")
    leia(aluno)

    escreva("Primeira nota: ")
    leia(primeiraNota)

    escreva("Segunda nota: ")
    leia(segundaNota)

    // cálculos
    media = (primeiraNota + segundaNota) / 2

    // exibindo dados
    limpa()
    escreva("=== Exbindo resultados ===")
    escreva("\nNome do aluno: ", aluno)
    escreva("\nPrimeira nota: ", primeiraNota)
    escreva("\nSegunda nota: ", segundaNota)
    escreva("\nSua média é: ", media)

    se (media >=6) {
    escreva("\nPARABÉNS O ALUNO ESTÁ APROVADO!")
    } 

    senao se (media >= 4 e media <6) {
    escreva("\nO ALUNO ESTÁ NA RECUPERAÇÃO")
    }
    
    se (media <4) {
    escreva("\nO ALUNO ESTÁ REPROVADO")
    }
  }
}
