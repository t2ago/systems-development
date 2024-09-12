from models.natural_person import Fisica

class Juridica:
    def __init__(self, fisica: Fisica, protocoloAtendimento: int) -> None:
        self.fisica = fisica
        self.protocoloAtendimento = protocoloAtendimento

    def __str__(self) -> str:
        return (
                f"{self.fisica}"
                f"Protocolo de Atendimento: {self.protocoloAtendimento}"
                )
