import os

# Função sem retorno.
def logoSenai():
    os.system("cls || clear")
    print("=== SENAI === ")

def imcCalculo():
    imc = peso / (altura * altura)
    imcs.append(imc)
    
    print("IMC:", round(imcs[i], 2))
    
    if imc < 18.5:
        print("Abaixo do peso.")
    elif imc >= 18.5 and imc < 25:
        print("Peso normal.")
    elif imc >= 25 and imc < 30:
        print("Sobrepeso.")
    elif imc >= 30 and imc < 35:
        print("Obesidade grau I")
    elif imc >= 35 and imc < 40:
        print("Obesidade grau II")
    else:
        print("Obesidade grau III (mórbida)")
    
    
    
    
# Definindo listas vazias para armazenar os dados dos usuários
nomes = []
sobrenomes = []
idades = []
alturas = []
pesos = []
imcs = []

# Solicitando os dados dos usuários em um loop
while True:
    logoSenai()
    nome = input("Digite o nome do usuário (ou digite 'sair' para encerrar): ")
    
    # Verificando se o usuário quer sair
    if nome.lower() == 'sair':
        break
    
    sobrenome = input("Digite o sobrenome do usúario: ")
    idade = int(input("Digite a idade do usuário: "))
    altura = float(input("Digite a altura do usuário (em metros): "))
    peso = float(input("Digite o peso do usuário (em quilogramas): "))
    
    # Adicionando os dados às listas
    nomes.append(nome)
    sobrenomes.append(sobrenome)
    idades.append(idade)
    alturas.append(altura)
    pesos.append(peso)

# Exibindo os dados armazenados
logoSenai()
print("\nDados dos usuários:")
for i in range(len(nomes)):
    print(f"Usuário {i+1}:")
    print("Nome:", nomes[i])
    print("Sobrenome:", sobrenomes[i])
    print("Idade:", idades[i])
    print("Altura:", alturas[i], "metros")
    print("Peso:", pesos[i], "quilogramas")
    imcCalculo()


