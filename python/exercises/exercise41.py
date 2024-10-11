import os
os.system("cls||clear")

notas = []

for i in range(3):
    nota = float(input(f"Digite a {i + 1}ª nota: "))
    notas.append(nota)

# ForEach.
for nota in notas:
    print(f"{i + 1}ª Nota: {notas[i]}")