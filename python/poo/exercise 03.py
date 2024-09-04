import os

os.system("cls || clear")

class Endereco:
    def __init__(self, logradouro: str, numero: str, cidade: str) -> None:
        self.logradouro = logradouro
        self.numero = numero
        self.cidade = cidade

    def __str__(self) -> str:
        return (f"\nLogradouro: {self.logradouro}" 
                f"\nNúmero: {self.numero}"
                f"\nCidade: {self.cidade}"
                )
    
class Aluno:
    def __init__(self, nome: str, idade: int, endereco: Endereco) -> None:
        self.nome = nome
        self.idade = idade
        self.endereco = endereco

    def __str__(self) -> str:
        return (f"Nome: {self.nome}"
                f"\nIdade: {self.idade}"
                f"\nEndereço: {self.endereco}"
                )

aluno = Aluno("Marta", 22,
              Endereco("Rua A", "33", "SP"))

print(aluno)