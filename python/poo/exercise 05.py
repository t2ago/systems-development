from abc import ABC, abstractmethod
import os

os.system("cls || clear")

class Funcionario(ABC):
    def __init__(self, nome: str, salario: float) -> None:
        self.nome = nome
        self.salario = salario

    @abstractmethod
    def salario_final(self) -> float:
        pass

    def __str__(self) -> str:
        return (f"\nNome: {self.nome}"
                f"\nSalário: {self.salario}"
                f"\nSalário final: {self.salario_final()}"
                )    

class Motoboy(Funcionario):
    BONIFICACAO = 1.1

    def salario_final(self) -> float:
        resultado = self.salario * self.BONIFICACAO
        return resultado

class Engenheiro(Funcionario):
    BONIFICACAO = 1.2

    def __init__(self, nome: str, salario: float, crea: str) -> None:
        super().__init__(nome, salario)
        self.crea = crea

    def salario_final(self) -> float:
        resultado = self.salario * self.BONIFICACAO
        return resultado

    def __str__(self) -> str:
        return (f"{super().__str__()}"
                f"\nCREA: {self.crea}"
                )

motoboy = Motoboy("Crico", 10)
engenheiro = Engenheiro("Ana", 10, "123")

print(motoboy)
print(engenheiro)