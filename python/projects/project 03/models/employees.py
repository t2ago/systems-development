from models.address import Endereco
from models.enums.sex import Sexo
from models.enums.sector import Setor

class Funcionario:
    def __init__(self, id: int, nome: str, cpf: str, rg: str, matricula: str, nascimento: str, sexo: Sexo, setor: Setor, salario: float, telefone: str, email: str, endereco: Endereco) -> None:
        self.id = id
        self.nome = nome
        self.cpf = cpf
        self.rg = rg
        self.matricula = matricula
        self.nascimento = nascimento
        self.sexo = sexo
        self.setor = setor
        self.salario = salario
        self.telefone = telefone
        self.email = email
        self.endereco = endereco

    def __str__(self) -> str:
        return (
                f"Id: {self.id}"
                f"\nNome: {self.nome}"
                f"\nCPF: {self.cpf}"
                f"\nRG: {self.rg}"
                f"\nMatrícula: {self.matricula}"
                f"\nData de Nascimento: {self.nascimento}"
                f"\nSexo: {self.sexo.value}"
                f"\nSetor: {self.setor.value}"
                f"\nSalário: {self.salario}"
                f"\nTelefone: {self.telefone}"
                f"\nEmail: {self.email}"
                f"\nEndereço: {self.endereco}"
                )
