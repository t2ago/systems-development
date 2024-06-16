import os
import time

pratos = []
soma = 0
valorTotal = 0
totalPaga = 0

while True:
    
    os.system("cls||clear")
    print("\t\t\t    Menu~")
    print("1 - Feijoada R$30 \t2 - Pirão R$30 \t\t\t3 - Leitão à pururuca R$60")
    print("4 - Moqueca  R$50 \t5 - Galinha com pequi R$40 \t6 - Virado à paulista R$30")
    print("7 - Acarajé  R$10 \t0 - Visualizar valor total a pagar")
    opcao = int(input("\nEscolha uma opção: "))
    
    match (opcao):
        case 1:
            prato1 = "1 - Feijoada"
            pratos.append(prato1)
            soma += 30
        case 2:
            prato2 = "2 - Pirão"
            pratos.append(prato2)
            soma += 30
        case 3:
            prato3 = "3 - Leitão à pururuca"
            pratos.append(prato3)
            soma += 60
        case 4:
            prato4 = "4 - Moqueca"
            pratos.append(prato4)
            soma += 50
        case 5:
            prato5 = "5 - Galinha com pequi"
            pratos.append(prato5)
            soma += 40
        case 6:
            prato6 = "6 - Virada à paulista"
            pratos.append(prato6)
            soma += 30
        case 7:
            prato7 = "7 - Acarajé"
            pratos.append(prato7)
            soma += 10
        case 0:
            os.system("cls||clear")
            valorTotal = soma
            print(f"Valor total a pagar: {valorTotal}R$")
        case _:
            os.system("cls||clear")
            print("Opção inválida!")
            time.sleep(3)
    
    valorTotal = soma
    
    resposta = input("Deseja fazer mais um pedido? (S/N): ")
    resposta = resposta.lower()

    match (resposta):
        case 'n':
            os.system("cls||clear")
            print("Em caso de pagamento À VISTA, havéra desconto de 10%")
            print("Em caso de pagamento À PRAZO, havéra acréscimo de 10%")
            print("1 - À vista \t2 - À prazo")
            pagamento = int(input("Escolha uma opção: "))
        
            os.system("cls||clear")
            
            print(f"Pratos: {pratos}")
            
            if pagamento == 1:
                totalPagar = valorTotal * 0.9
                print(f"Forma de pagamento: À vista.")
                print(f"Desconto: {totalPagar - valorTotal} R$")
            else:
                totalPagar = valorTotal * 1.10
                print(f"Forma de pagamento: À prazo.")
                print(f"Acréscimo: {totalPagar - valorTotal} R$")
            
            print(f"Subtotal: {valorTotal} R$")
            print(f"Total a pagar: {totalPagar} R$")
            break