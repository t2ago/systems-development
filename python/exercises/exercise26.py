import os
os.system("cls||clear")

login = input(f"Digite o seu login: ")
senha = input(f"Digite sua senha: ")

if login == "Marta" and senha == "123" :
    print(f"Bem-vindo!")
else :
    print(f"Login ou senha inválidos.")