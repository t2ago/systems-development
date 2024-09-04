import os

os.system("cls || clear")

class ContaBancaria:
    def __init__(self, banco: str, agencia: str, numero: str, tipo: str, saldo: float, limite: float) -> None:
        self.banco = banco
        self.agencia = agencia
        self.numero = numero
        self.tipo = tipo
        self.saldo = saldo
        self.limite = limite

    def __str__(self) -> str:
        return (f"\nBanco: {self.banco}"
                f"\nAgência: {self.agencia}"
                f"\nNúmero: {self.numero}"
                f"\nTipo: {self.tipo}"
                f"\nSaldo: {self.saldo}"
                f"\nLimite: {self.limite}"
                )

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

class Funcionario:
    def __init__(self, codigo: str, nome: str, endereco: Endereco, telefone: str, email: str, contaBanco: ContaBancaria) -> None:
        self.codigo = codigo
        self.nome = nome
        self.endereco = endereco
        self.telefone = telefone
        self.email = email
        self.contaBanco = contaBanco

    def __str__(self) -> str:
        return (f"Código do Funcionário: {self.codigo}"
                f"\nNome: {self.nome}"
                f"\nEndereco: {self.endereco}"
                f"\nTelefone: {self.telefone}"
                f"\nEmail: {self.email}"
                f"\nConta bancária: {self.contaBanco}"
                )

funcionario = Funcionario("123", "Ana",
                          Endereco("Rua A", "33", "SP"), "11 99999-9999", "ana@gmail.com",
                          ContaBancaria("A", "B", "23", "C", "0.99", "1000"))

print(funcionario)