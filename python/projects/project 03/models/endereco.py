from models.enums.unidade_federativa import UnidadeFederativa

class Endereco:
    def __init__(self, logradouro: str, numero: str, uf: UnidadeFederativa) -> None:
        self.logradouro = logradouro
        self.numero = numero
        self.uf = uf

    def __str__(self) -> str:
        return (
                f"\nLogradouro: {self.logradouro}"
                f"\nNúmero: {self.numero}"
                f"\nUf: {self.uf.nome}/{self.uf.sigla}"
                )