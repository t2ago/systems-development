import os
os.system("cls||clear")

nota = -1
soma = 0
i = 0

while nota < 0 or nota > 10 or opcao == 'S':
    nota = float(input(f"Digite uma nota: "))
    soma += nota
    i += 1
        
    if nota < 0 or nota > 10:
        print("Nota inválida!")
    elif nota > 0 or nota < 10: 
        opcao = input(f"Deseja inserir mais uma nota (S/N): ")
        opcao = opcao.upper()
    else:
        break
    
    
media = soma / i

os.system("cls||clear")
print(f"Média: {media}")

if media > 7:
    print("Aprovado!")
elif media > 5 and media < 6.9:
    print("Recuperação!")
else:
    print("Reprovado!")