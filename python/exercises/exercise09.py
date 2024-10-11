import os
os.system("cls||clear")

QUANTIDADE_NUMEROS = 10

numeros = []
somaPositivos = 0
negativos = 0

for i in range(QUANTIDADE_NUMEROS):
    numero = int(input(f"Digite o {i + 1}º número: "))
    numeros.append(numero)

    if numero > 0:
        somaPositivos = sum(numeros)
        
    else:
        negativos += 1

os.system("cls||clear")
for i in range(len(numeros)):
    print(f"{i + 1}º Número: {numeros[i]}")

print(f"\nSoma positivos: {somaPositivos}")
print(f"Quantidade negativos: {negativos}")