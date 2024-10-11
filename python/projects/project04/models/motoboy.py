from models.employee import Employee

class Motoboy:
    def __init__(self, funcionario: Employee, cnh: str) -> None:
        self.funcionario = funcionario
        self.cnh = cnh

    def __str__(self) -> str:
        return (
                f"\nMotoboy"
                f"\n{self.funcionario}"
                f"\nCNH: {self.cnh}"
                )