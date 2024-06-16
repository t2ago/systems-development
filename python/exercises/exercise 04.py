import os
os.system("cls||clear")

QUANTIDADE_NOTAS = 4
notas = []

for i in range(QUANTIDADE_NOTAS):
    nota = float(input(f"Digite a {i + 1}ª nota: "))
    notas.append(nota)

media = sum(notas) / QUANTIDADE_NOTAS

os.system("cls||clear")
for i, nota in enumerate(notas):
    print(f"{i+1}ª Nota: {nota}")

print(f"Média: {media}")

if media >= 7:
    print("Aprovado!")
elif media >= 4.1 and media < 7:
    print("Recuperação!")
else:
    print("Reprovado!")