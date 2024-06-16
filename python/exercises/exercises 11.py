import os
os.system("cls||clear")

QUANTIDADE_NUMEROS = 5

numeros = []
def cabecalho():
    os.system("cls||clear")
    print("--------------------")
    print("=== SENAI | FIEB ===")
    print("--------------------")

for i in range(QUANTIDADE_NUMEROS):
    cabecalho()
    numero = int(input(f"Digite o {i + 1}º número: "))
    if numero < 0:
        numero = 0
    numeros.append(numero)



for i, numero in enumerate(numeros):
    print(f"{i + 1}º Número: {numero}")