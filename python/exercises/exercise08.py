import os
os.system("cls||clear")

QUANTIDADE_NUMEROS = 6

numeros = []
pares = 0
impares = 0


for i in range(QUANTIDADE_NUMEROS):
    numero = int(input(f"Digite o {i + 1}º número: "))
    numeros.append(numero)

    if numero % 2 == 0:
        pares += 1
    else:    
        impares += 1

os.system("cls||clear")
for i in range(len(numeros)):
    print(f"{i + 1}º Número: {numeros[i]}")

print(f"Pares: {pares}")
print(f"Impares: {impares}")