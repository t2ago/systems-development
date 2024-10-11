from models.employee import Employee

class Advogado:
    def __init__(self, funcionario: Employee, oab: str) -> None:
        self.funcionario = funcionario
        self.oab = oab

    def __str__(self) -> str:
        return (
                f"\nAdvogado"
                f"\n{self.funcionario}"
                f"\nOAB: {self.oab}"
                )