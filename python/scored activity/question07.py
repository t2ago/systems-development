class Reserva:
    def __init__(self, numero_aviao, nome_passageiro):
        self.numero_aviao = numero_aviao
        self.nome_passageiro = nome_passageiro

class CompanhiaAerea:
    def __init__(self):
        self.quantidade_avioes = 0
        self.avioes = []
        self.assentos_disponiveis = []

    def solicitar_quantidade_avioes(self):
        self.quantidade_avioes = int(input("Digite a quantidade de aviões: "))

    def registrar_numero_aviao(self):
        print("Opção 1: Registrar o número de cada avião")
        for i in range(self.quantidade_avioes):
            self.avioes.append(input(f"Informe o número do {i + 1}º avião: "))

    def registrar_assentos_disponiveis(self):
        print("\nOpção 2: Registrar o quantitativo de assentos disponíveis em cada avião")
        for aviao in self.avioes:
            assentos = int(input(f"Informe o número de assentos disponíveis para o avião {aviao}: "))
            self.assentos_disponiveis.append(assentos)

    def reservar_passagem(self, reservas):
        print("\nOpção 3: Reservar passagem aérea")
        if len(reservas) >= 10:
            print("Limite de reservas atingido!")
            return

        numero_aviao = input("Digite o número do avião: ")
        if numero_aviao not in self.avioes:
            print("Este avião não existe!")
            return

        index_aviao = self.avioes.index(numero_aviao)
        if self.assentos_disponiveis[index_aviao] <= 0:
            print("Não há assentos disponíveis para este avião!")
            return

        nome_passageiro = input("Digite o nome do passageiro: ")
        reservas.append(Reserva(numero_aviao, nome_passageiro))
        self.assentos_disponiveis[index_aviao] -= 1
        print("Reserva realizada com sucesso!")

    def consultar_por_aviao(self, reservas):
        print("\nOpção 4: Realizar consulta por avião")
        numero_aviao = input("Digite o número do avião: ")
        if numero_aviao not in self.avioes:
            print("Este avião não existe!")
            return

        reservas_aviao = [reserva for reserva in reservas if reserva.numero_aviao == numero_aviao]
        if not reservas_aviao:
            print("Não há reservas realizadas para este avião!")
            return

        print("Reservas para o avião", numero_aviao)
        for reserva in reservas_aviao:
            print("Passageiro:", reserva.nome_passageiro)

    def consultar_por_passageiro(self, reservas):
        print("\nOpção 5: Realizar consulta por passageiro")
        nome_passageiro = input("Digite o nome do passageiro: ")
        reservas_passageiro = [reserva for reserva in reservas if reserva.nome_passageiro == nome_passageiro]
        if not reservas_passageiro:
            print("Não há reservas realizadas para este passageiro!")
            return

        print("Reservas para o passageiro", nome_passageiro)
        for reserva in reservas_passageiro:
            print("Avião:", reserva.numero_aviao)

    def exibir_menu(self):
        reservas = []
        while True:
            print("\nMenu:")
            print("1: Solicitar quantidade de aviões")
            print("2: Registrar número de cada avião")
            print("3: Registrar quantidade de assentos disponíveis em cada avião")
            print("4: Reservar passagem aérea")
            print("5: Consultar por avião")
            print("6: Consultar por passageiro")
            print("7: Encerrar")
            opcao = input("Escolha uma opção: ")

            if opcao == '1':
                self.solicitar_quantidade_avioes()
            elif opcao == '2':
                self.registrar_numero_aviao()
            elif opcao == '3':
                self.registrar_assentos_disponiveis()
            elif opcao == '4':
                self.reservar_passagem(reservas)
            elif opcao == '5':
                self.consultar_por_aviao(reservas)
            elif opcao == '6':
                self.consultar_por_passageiro(reservas)
            elif opcao == '7':
                break
            else:
                print("Opção inválida! Tente novamente.")

companhia = CompanhiaAerea()
companhia.exibir_menu()