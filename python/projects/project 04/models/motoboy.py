from models.employee import Employee

class Advogado:
    def __init__(self, funcionario: Employee, cnh: str) -> None:
        self.funcionario = funcionario
        self.cnh = cnh

    def __str__(self) -> str:
        return (
                f"{self.funcionario}"
                f"CNH: {self.cnh}"
                )