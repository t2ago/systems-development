programa {
  funcao inicio() {
    // Declaração de varáveis.
    cadeia nome
    caracter sexo
    inteiro idade
    real peso

    // Solicitando dados para o usuário.
    escreva("Digite seu nome: ")
    leia(nome)

    escreva("Digite seu sexo - utilize M ou F : ")
    leia(sexo)

    escreva("Digite sua idade: ")
    leia(idade)

    escreva("Digite seu peso: ")
    leia(peso)

    // Exibindo dados para o usuário.
    //Limpa o terminal, apagando o conteúdo exibido anteriormente
    limpa()
    escreva("===Exibindo dados para o usuário ===")
    escreva("\nNome: ", nome)
    escreva("\nSexo: ", sexo)
    escreva("\nIdade: ", idade, " anos")
    escreva("\nPeso: ", peso, "kg")
  }
}
