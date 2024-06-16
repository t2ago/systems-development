# Somando as notas.
def calcularMedia(notas):
    soma = sum(notas)
    return soma / len(notas)

# Verificando se está aprovado ou reprovado.
def verificarSituacao(media):
    if media >= 7:
        return "Aprovado!"
    else:
        return "Reprovado!"

# Calculando a média.
def mostrarResultado(notas):
    media = calcularMedia(notas)
    print("\nMédia: {:.1f}".format(media))
    print("Resultado:", verificarSituacao(media))

# Pergutando as notas e exibindo os resultados.
def main():
    notas = []
    for i in range(1, TAM + 1):
        nota = float(input(f"Digite a {i}ª nota: "))
        notas.append(nota)

    mostrarResultado(notas)

TAM = 3
main()
