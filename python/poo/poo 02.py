import os

os.system("cls || clear")

class Pet:
    def __init__(self, nome: str, idade: int, raca: str, porte: str, alimentacao: str) -> None:
        self.nome = nome
        self.idade = idade
        self.raca = raca
        self.porte = porte
        self.alimentacao = alimentacao

    def exibir_dados(self) -> str:
        return (f"Nome: {self.nome}"
                f"\nIdade: {self.idade}"
                f"\nRaça: {self.raca}"
                f"\nPorte: {self.porte}"
                f"\nAlimentação: {self.alimentacao}"
                )

pet1 = Pet("Dog", 5, "A", "Médio", "Carne")
pet2 = Pet("Cat", 3, "B", "Pequeno", "Peixe")

print(pet1.exibir_dados())
print(pet2.exibir_dados())