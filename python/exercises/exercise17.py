import os
os.system("cls||clear")

nota = float(input("Digite sua nota: "))

if nota >= 7:
    print("Aprovado.")
elif nota >= 5:
    print("Recuperação.")
else:
    print("Reprovado.")

print("=== FIM ===")