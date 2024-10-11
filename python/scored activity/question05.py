from dataclasses import dataclass  # Importa o decorador para criar classes de dados

@dataclass  # Define que a classe Cliente será uma classe de dados
class Cliente:
    nome: str  # Armazena o nome do cliente
    idade: str  # Armazena a idade do cliente
    cpf: str  # Armazena o CPF do cliente
    cep: str  # Armazena o CEP do cliente
    endereco: str  # Armazena o endereço do cliente

def obter_dados():
    clientes = []  # Lista vazia para armazenar os clientes

    while True:
        # Solicita ao usuário que insira os dados do cliente
        nome = input("Digite o nome: ")
        idade = input("Digite a idade: ")
        cpf = input("Digite o CPF: ")
        cep = input("Digite o CEP: ")
        endereco = input("Digite o endereço: ")

        # Cria e adiciona à lista de clientes
        cliente = Cliente(nome, idade, cpf, cep, endereco)
        clientes.append(cliente)

        # Pergunta se deseja adicionar outro cliente, se não, encerra o loop
        continuar = input("Deseja adicionar outro cliente? (s/n): ")
        if continuar.lower() != 's':
            break

    return clientes  # Retorna a lista de clientes preenchida

def salvar_dados(clientes):
    # Abre o arquivo "clientes.txt" para escrita
    with open("clientes.txt", "w") as arquivo:
        # Escreve os dados de cada cliente no arquivo
        for cliente in clientes:
            linha = f"{cliente.nome},{cliente.idade},{cliente.cpf},{cliente.cep},{cliente.endereco}"
            arquivo.write(linha + "\n")

def ler_dados():
    # Abre o arquivo "clientes.txt" para leitura
    with open("clientes.txt", "r") as arquivo:
        # Lê todas as linhas do arquivo e armazena em uma lista
        linhas = arquivo.readlines()
        clientes = []
        # Para cada linha lida, separa os dados pelo separador "," e cria um objeto Cliente, adicionando-o à lista
        for linha in linhas:
            nome, idade, cpf, cep, endereco = linha.strip().split(",")
            cliente = Cliente(nome, idade, cpf, cep, endereco)
            clientes.append(cliente)
        return clientes  # Retorna a lista de clientes lidos do arquivo

# Obtém os dados dos clientes
clientes = obter_dados()
# Salva os dados dos clientes no arquivo
salvar_dados(clientes)

# Lê os dados dos clientes do arquivo
clientes_lidos = ler_dados()
# Imprime os dados dos clientes lidos
for cliente in clientes_lidos:
    print(f"Nome: {cliente.nome}, Idade: {cliente.idade}, CPF: {cliente.cpf}, CEP: {cliente.cep}, Endereço: {cliente.endereco}")
