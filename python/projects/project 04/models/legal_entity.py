from models.person import Pessoa

class Juridica:
    def __init__(self, pessoa: Pessoa, cnpj: str, inscricaoEstadual: str) -> None:
        self.pessoa = pessoa
        self.cnpj = cnpj
        self.inscricaoEstadual = inscricaoEstadual

    def __str__(self) -> str:
        return (
                f"{self.pessoa}"
                f"\nCNPJ: {self.cnpj}"
                f"\nInscrição Estadual: {self.inscricaoEstadual}"
                )