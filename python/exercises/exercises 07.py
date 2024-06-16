import os
os.system("cls||clear")

QUANTIDADE_NUMEROS = 5

numeros = []

for i in range(QUANTIDADE_NUMEROS):
    numero = int(input(f"Digite o {i + 1}º número: "))
    numeros.append(numero)

    maior = max(numeros)
    menor = min(numeros)

os.system("cls||clear")
for i in range(len(numeros)):
    print(f"{i + 1}º Número: {numeros[i]}")

print(f"Maior: {maior}")
print(f"Menor: {menor}")