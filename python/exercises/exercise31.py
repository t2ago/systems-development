import os
import time
os.system("cls||clear")

soma = 0
quantidadeNotas = 0

while True:
    os.system("cls||clear")
    nota = float(input("Digite uma nota: "))
    
    resposta = input("\nS - Inserir mais uma nota. \nP - Ver quantas notas foram inseridas. \nN - Mostrar média. \nOpção: ")
    resposta = resposta.upper()
    
    soma += nota
    quantidadeNotas += 1
        
    match (resposta):
        case 'P':
            print(f"Notas inseridas: {quantidadeNotas}")
            time.sleep(4)
        case 'N':
            break
            
    
    
media = soma / quantidadeNotas

os.system("cls||clear")
print(f"Média: {media}")

if media > 7:
    print("Aprovado!")
elif media > 5 and media < 6.9:
    print("Recuperação!")
else:
    print("Reprovado!")