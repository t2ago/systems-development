from models.employee import Employee

class Medico:
    def __init__(self, funcionario: Employee, crm: str) -> None:
        self.funcionario = funcionario
        self.crm = crm

    def __str__(self) -> str:
        return (
                f"{self.funcionario}"
                f"CRM: {self.crm}"
                )