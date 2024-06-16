import os
from dataclasses import dataclass

os.system("cls||clear")

QUANTIDADE_PETS = 2

@dataclass
class Pet:
    nome: str
    idade: int
    raca: str
    porte: str
    alimentacao: str
    
pets = []

for i in range(QUANTIDADE_PETS):
    nome = input("Digite o nome do pet: ")
    idade = int(input("Digite a idade do pet: "))
    raca = input("Digite a raça do pet: ")
    porte = input("Digite o porte do pet: ")
    alimentacao = input("Digite a alimentação do pet: ")
    pet = Pet(nome = nome, idade = idade, raca = raca, porte = porte, alimentacao = alimentacao)
    pets.append(pet)
    
for dados_pet in pets:
    print(f"Nome: {dados_pet.nome}")
    print(f"Idade: {dados_pet.idade}")
    print(f"Raca: {dados_pet.raca}")
    print(f"Porte: {dados_pet.porte}")
    print(f"alimentacao: {dados_pet.alimentacao}")