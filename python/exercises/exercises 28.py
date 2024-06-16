import os
os.system("cls||clear")

nome = input("Digite o nome do aluno: ")
idade = int(input("Digite a idade do aluno: "))
primeiraNota = float(input("Digite a 1ª nota: "))
segundaNota = float(input("Digite a 2ª nota: "))
media = float((primeiraNota + segundaNota) /2)

print(f"\nAluno: {nome}")
print(f"Idade: {idade}")
print(f"Primeira nota: {primeiraNota}")
print(f"Segunda nota: {segundaNota}")
print(f"Média: {media}")