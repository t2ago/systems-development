import os
os.system("cls||clear")

primeiroNumero = int(input("Digite o 1º número inteiro: "))
segundoNumero = int(input("Digite o 2º número inteiro: "))
soma = primeiroNumero + segundoNumero
media = soma / 2
produto = primeiroNumero * segundoNumero

maior = max(primeiroNumero, segundoNumero)
menor = min(primeiroNumero, segundoNumero)

os.system("cls||clear")
print(f"\nPrimeiro número: {primeiroNumero}")
print(f"Segundo número: {segundoNumero}")
print(f"Soma: {soma}")
print(f"Média: {media}")
print(f"Produto: {produto}")
print(f"Maior número: {maior}")
print(f"Menor número: {menor}")

if primeiroNumero == segundoNumero :
    print(f"Os números são iguais!")
else :
    print(f"Os números NÃO são iguais!")