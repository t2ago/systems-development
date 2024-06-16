import os
os.system("cls||clear")

def cabecalho():
    os.system("cls||clear")
    print("--------------------")
    print("=== SENAI | FIEB ===")
    print("--------------------")

def somar(n1, n2):
    resultado = n1 + n2
    return resultado

def sub(n1, n2):
    resultado = n1 - n2
    return resultado

def div(n1, n2):
    resultado = n1 / n2
    return resultado

def mult(n1, n2):
    resultado = n1 * n2
    return resultado

cabecalho()
primeiroNumero = int(input("Digite o primeiro número: "))
segundoNumero = int(input("Digite o segundo número: "))

soma = somar(primeiroNumero, segundoNumero)
subtracao = sub(primeiroNumero, segundoNumero)
divisao = div(primeiroNumero, segundoNumero)
multiplicacao = mult(primeiroNumero, segundoNumero)

cabecalho()
print(f"Soma: {soma}")
print(f"Subtração: {subtracao}")
print(f"Divisão: {divisao}")
print(f"Multiplicação: {multiplicacao}")