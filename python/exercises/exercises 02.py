import os
os.system("cls||clear")

primeiraNota = -1
segundaNota = -1

while (primeiraNota < 0 or primeiraNota > 10):
    primeiraNota= float(input("Digite a 1ª nota: "))
    
while (segundaNota < 0 or segundaNota > 10):
    segundaNota= float(input("Digite a 2ª nota: "))
  
media = (primeiraNota + segundaNota) / 2

os.system("cls||clear")
print(f"1ª nota informada: {primeiraNota}")
print(f"2ª nota informada: {segundaNota}")
print(f"Média: {media}")
