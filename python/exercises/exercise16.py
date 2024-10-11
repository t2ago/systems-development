import os
from dataclasses import dataclass

os.system("cls||clear")

QUANTIDADE = 1

@dataclass
class Veiculo:
    placa: str
    cor: str
    passageiros: int
    capacidadeTanque: float
    velocidadeMaxima: float
    consumoMedio: float
    
@dataclass
class Cliente:
    nome: str
    idade: int
    cpf: int
    endereco: str
    telefone: int
    
veiculos = []
clientes = []

for i in range(QUANTIDADE):
    placa = input("Digite a placa do veículo: ")
    cor = input("Digite a cor do veículo: ")
    passageiros = int(input("Digite o número de passageiros: "))
    capacidadeTanque = float(input("Digite a capacidade do tanque: "))
    velocidadeMaxima = float(input("Digite a velocidade máxima: "))
    consumoMedio = float(input("Digite o consumo médio: "))
    veiculo = Veiculo(placa = placa, cor = cor, passageiros = passageiros, capacidadeTanque = capacidadeTanque, velocidadeMaxima = velocidadeMaxima, consumoMedio = consumoMedio)
    veiculos.append(veiculo)

for i in range(QUANTIDADE):
    nome = input("Digite o nome do cliente: ")
    idade = int(input("Digite a idade do cliente: "))
    cpf = int(input("Digite o CPF do cliente: "))
    endereco = input("Digite o endereço do cliente: ")
    telefone = int(input("Digite o telefone do cliente: "))
    cliente = Cliente(nome = nome, idade = idade, cpf = cpf, endereco = endereco, telefone = telefone)
    clientes.append(cliente)
    
for dados_veiculos in veiculos:
    print(f"Placa: {dados_veiculos.placa}")
    print(f"Cor: {dados_veiculos.cor}")
    print(f"Número de passageiros: {dados_veiculos.passageiros}")
    print(f"Capacidade de tanque: {dados_veiculos.capacidadeTanque}")
    print(f"Velocidade máxima: {dados_veiculos.velocidadeMaxima}")
    print(f"Consumo médio: {dados_veiculos.consumoMedio}")
    
for dados_clientes in clientes:
    print(f"Nome: {dados_clientes.nome}")
    print(f"Idade: {dados_clientes.idade}")
    print(f"CPF: {dados_clientes.cpf}")
    print(f"Endereço: {dados_clientes.endereco}")
    print(f"Telefone: {dados_clientes.telefone}")