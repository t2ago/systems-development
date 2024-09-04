from abc import ABC, abstractmethod
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

class Funcionario(ABC):
    def __init__(self, nome: str, salario: float, endereco: Endereco) -> None:
        self.nome = nome
        self.salario = salario
        self.endereco = endereco

    @abstractmethod
    def salario_final(self) -> float:
        pass

    def __str__(self) -> str:
        return (f"\nNome: {self.nome}"
                f"\nSalário: {self.salario}"
                f"\nSalário final: {self.salario_final()}"
                f"\nEndereço: {self.endereco}"
                )    

class Medico(Funcionario):
    BONIFICACAO = 1.2

    def __init__(self, nome: str, salario: float, crm: str, endereco: Endereco) -> None:
        super().__init__(nome, salario, endereco)
        self.crm = crm

    def salario_final(self) -> float:
        resultado = self.salario * self.BONIFICACAO
        return resultado
    
    def __str__(self) -> str:
        return (f"{super().__str__()}"
                f"\nCRM: {self.crm}"
                )

class Engenheiro(Funcionario):
    BONIFICACAO = 1.1

    def __init__(self, nome: str, salario: float, crea: str, endereco: Endereco) -> None:
        super().__init__(nome, salario, endereco)
        self.crea = crea

    def salario_final(self) -> float:
        resultado = self.salario * self.BONIFICACAO
        return resultado

    def __str__(self) -> str:
        return (f"{super().__str__()}"
                f"\nCREA: {self.crea}"
                )

medico = Medico("Clara", 4000, "321",
                Endereco("Rua A", "33", "SP"))
engenheiro = Engenheiro("Ana", 3000, "123",
                Endereco("Rua B", "55", "RS"))

print(engenheiro)
print(medico)