import os
os.system("cls||clear")

def calInss(salario):
    global inss
    if salario < 1100:
        inss = salario * 0.075
        
    elif salario >= 1100.01 and salario < 2203.48:
        inss = salario * 0.09
        
    elif salario >= 2203.49 and salario < 3305.22:
        inss = salario * 0.12
        
    elif salario >= 3305.23 and salario < 6433.57:
        inss = salario * 0.14
        
    if inss > 854.36:
        inss = 854.36
    
    return inss
    
def calIrrf(salario):
    global irrf
    if salario >= 2259.21 and salario < 2826.65:
        irrf = salario * 0.075
        
    elif salario >= 2826.66 and salario < 3751.05:
        irrf = salario * 0.15
        
    elif salario >= 3751.06 and salario < 4664.68:
        irrf = salario * 0.225
        
    elif salario > 4664.68:
        irrf = salario * 0.275
    
    return irrf
    
def dependentes(salario):
    deducao = 189.59 * qtdDependentes

    return deducao
    
def valeTransporte(salario, resposta):
    if resposta == 's':
        transporte = salario * 0.06
    
    return transporte
    
def valeRefeição(salario):
    refeicao = vale * 0.20
    
    return refeicao
    
def planoSaude(salario):
    saude = 150
    
    return saude

inss = 0
irrf = 0
salario = 0
deducao = 0
transporte = 0
refeicao = 0
saude = 0
descontoTotal = 0
salarioFinal = 0

matricula = input("Digite sua matrícula: ")
senha =  input("Digite sua senha: ")
salario = float(input("Digite seu salário: "))
qtdDependentes = int(input("Você tem quantos dependentes: "))
resposta = input("Deseja receber vale transporte? (s/n): ")
resposta = resposta.lower()
vale = float(input("Valor do vale refeição fornecido pela empresa: "))

inss = calInss(salario)
irrf = calIrrf(salario)
deducao = dependentes(salario)
transporte = valeTransporte(salario, resposta)
refeicao = valeRefeição(salario)
saude = planoSaude(salario)

descontoTotal = inss + irrf + deducao + transporte + refeicao + saude
salarioFinal = salario - descontoTotal
salarioLiquido = round(salarioFinal, 2)

os.system("cls||clear")
print(f"Salário liquido:", salarioLiquido)