programa {
  funcao inicio() {
    cadeia dia

    escreva("=== SEMANA ===")
    escreva("\nDIA 1 DOMINGO")
    escreva("\nDIA 2 SEGUNDA")
    escreva("\nDIA 3 TERÇA")
    escreva("\nDIA 4 QUARTA")
    escreva("\nDIA 5 QUINTA")
    escreva("\nDIA 6 SEXTA")
    escreva("\nDIA 7 SÁBADO")
    escreva("\n\nDigite o DIA desejado: ")
    leia(dia)

    limpa()
    escolha (dia) {
      caso "1":
      dia = "DOMINGO É FINAL DE SEMANA"
      pare
      caso "2":
      dia = "SEGUNDA É DIA ÚTIL"
      pare
      caso "3":
      dia = "TERÇA É DIA ÚTIL"
      pare
      caso "4":
      dia = "QUARTE É DIA ÚTIL"
      pare
      caso "5":
      dia = "QUINTA É DIA ÚTIL"
      pare
      caso "6":
      dia = "SEXTA É DIA ÚTIL"
      pare
      caso "7":
      dia = "SÁBADO É FINAL DE SEMANA"
      pare
      caso contrario:
      dia = "DIA INVÁLIDO"
      }
      escreva("=== Exibindo resultados ===")
      escreva("\n",dia)
    }
  }
