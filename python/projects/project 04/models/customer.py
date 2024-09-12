from models.natural_person import Fisica

class Cliente:
    def __init__(self, fisica: Fisica, protocoloAtendimento: int) -> None:
        self.fisica = fisica
        self.protocoloAtendimento = protocoloAtendimento

    def __str__(self) -> str:
        return (
                f"\nCliente"
                f"\n{self.fisica}"
                f"\nProtocolo de Atendimento: {self.protocoloAtendimento}"
                )
