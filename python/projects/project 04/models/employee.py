from models.natural_person import Fisica
from models.enums.sector import Setor
from abc import ABC, abstractmethod

class Funcionario(ABC):
    def __init__(self, fisica: Fisica, matricula: str, setor: Setor):
        self.fisica = fisica
        self.matricula = matricula
        self.setor = setor
    
    @abstractmethod
    def salario(self):
        pass

class Employee(Funcionario):
    def __init__(self, fisica: Fisica, matricula: str, setor: Setor, salario: float):
        super().__init__(fisica, matricula, setor)
        self._salario = salario
    
    def salario(self):
        return self._salario
    
    def __str__(self) -> str:
        return (
                f"{self.fisica}"
                f"\nMatrícula: {self.matricula}"
                f"\nSetor: {self.setor.value}"
                f"\nSalário: {self._salario}"
                )

