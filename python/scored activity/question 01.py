"""
Descrição das variáveis:
  - quantidadePares: Quantidade de números pares.
  - quantidadeImpares: Quantidade de números ímpares.
  - quantidadePositivos: Quantidade de números positivos.
  - quantidadeNegativos: Quantidade de números negativos.
  - maiorNumero: O maior número.
  - menorNumero: O menor número.
  - mediaPares: Média dos números pares.
  - mediaImpares: Média dos números ímpares.
  - mediaGeral: Média de todos os números.
"""

# Variáveis para armazenar os números
numeros = []

for i in range(1,6):
    numero = int(input(f"Digite o {i}º número inteiro: "))
    numeros.append(numero)

# Variáveis para armazenar as estatísticas
quantidadePares = 0
quantidadeImpares = 0
quantidadePositivos = 0
quantidadeNegativos = 0
somaPares = 0
somaImpares = 0
somaGeral = 0

# Processando cada número
for numero in numeros:
    if numero % 2 == 0:
        quantidadePares += 1
        somaPares += numero
    else:
        quantidadeImpares += 1
        somaImpares += numero

    if numero > 0:
        quantidadePositivos += 1
    else:
        quantidadeNegativos += 1

    maiorNumero = max(numeros)
    menorNumero = min(numeros)

    somaGeral += numero

# Calculando as médias
mediaPares = somaPares / quantidadePares
mediaImpares = somaImpares / quantidadeImpares
mediaGeral = somaGeral / 5

# Imprimindo as estatísticas
print("\nEstatísticas dos números:")
print(f"Quantidade de pares: {quantidadePares}")
print(f"Quantidade de ímpares: {quantidadeImpares}")
print(f"Quantidade de positivos: {quantidadePositivos}")
print(f"Quantidade de negativos: {quantidadeNegativos}")
print(f"Quantidade de números inseridos: 5")
print(f"Maior número: {maiorNumero}")
print(f"Menor número: {menorNumero}")
print(f"Média de números pares: {mediaPares}")
print(f"Média de números impares: {mediaImpares}")
print(f"Média de todos os números: {mediaGeral}")
print(f"Números na ordem inversa: {numeros[::-1]}")