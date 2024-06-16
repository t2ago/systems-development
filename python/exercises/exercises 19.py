import os
os.system("cls||clear")

soma = 0

for i in range(1,4): 
    while True:
        nota = float(input(f"Digite uma nota: "))
        
        if nota < 0 or nota > 10:
            print("Nota inválida!")
        else:
            soma += nota
            break
    
    
media = soma / 3

os.system("cls||clear")     
print(f"Média: {media}")

if media > 7:
    print("Aprovado!")
elif media > 5 and media < 6.9:
    print("Recuperação!")
else:
    print("Reprovado!")