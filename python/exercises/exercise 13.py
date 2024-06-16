import os
from dataclasses import dataclass

os.system("cls||clear")

QUANTIDADE_ALUNOS = 2

# Classe padrão
#class Aluno:
    #def __init__(self, nome, idade):
        #self.nome = nome
        #self.idade = idade
        
# Classe com import
@dataclass
class Aluno:
    nome: str
    idade: int
    peso: float
    altura: float
    
alunos = []

for i in range(QUANTIDADE_ALUNOS):
    nome = input("Digite seu nome: ")
    idade = int(input("Digite sua idade: "))
    peso = float(input("Digite seu peso: "))
    altura = float(input("Digite sua altura: "))
    aluno = Aluno(nome = nome, idade = idade, peso = peso, altura = altura)
    alunos.append(aluno)
    
for dados_aluno in alunos:
    print(f"Nome: {dados_aluno.nome}")
    print(f"Idade: {dados_aluno.idade}")
    print(f"Peso: {dados_aluno.peso}")
    print(f"Altura: {dados_aluno.altura}")