import os
os.system("cls||clear")

soma = 0
quantidadeNotas = 0

while True:
    nota = float(input("Digite uma nota: "))
    
    resposta = input("Deseja inserir mais uma nota: ")
    resposta = resposta.upper()
    
    soma += nota
    quantidadeNotas += 1
        
    if resposta == "N":
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