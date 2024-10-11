from models.person import Pessoa
from models.enums.gender import Sexo

class Fisica:
    def __init__(self, pessoa: Pessoa, cpf: str, rg: str, nascimento: str, sexo: Sexo) -> None:
        self.pessoa = pessoa
        self.cpf = cpf
        self.rg = rg
        self.nascimento = nascimento
        self.sexo = sexo

    def __str__(self) -> str:
        return (
                f"{self.pessoa}"
                f"\nCPF: {self.cpf}"
                f"\nRG: {self.rg}"
                f"\nData de Nascimento: {self.nascimento}"
                f"\nSexo: {self.sexo.value}"
                )