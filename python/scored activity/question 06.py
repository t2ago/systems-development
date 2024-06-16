class Estoque:
    def __init__(self):
        self.itens = {}

    def adicionarItem(self, item, quantidade):
        if item in self.itens:
            self.itens[item] += quantidade
        else:
            self.itens[item] = quantidade

    def removerItem(self, item, quantidade):
        if item in self.itens:
            if self.itens[item] >= quantidade:
                self.itens[item] -= quantidade
                if self.itens[item] == 0:
                    del self.itens[item]
            else:
                print("Quantidade insuficiente em estoque.")
        else:
            print("Item não encontrado no estoque.")

    def exibirEstoque(self):
        print("Estoque atual:")
        for item, quantidade in self.itens.items():
            print(f"{item}: {quantidade}")

    def pesquisarItem(self, item):
        if item in self.itens:
            print(f"{item}: {self.itens[item]}")
        else:
            print("Item não encontrado no estoque.")

def menu():
    print("\nEscolha uma opção:")
    print("1. Adicionar item ao estoque.")
    print("2. Remover item do estoque.")
    print("3. Exibir estoque atual.")
    print("4. Pesquisar item no estoque.")
    print("5. Sair.")

estoque = Estoque()

while True:
    menu()
    opcao = input("Opção: ")
    
    match (opcao):
        case '1':
            item = input("Nome do item: ")
            quantidade = int(input("Quantidade a adicionar: "))
            estoque.adicionarItem(item, quantidade)
        case '2':
            item = input("Nome do item: ")
            quantidade = int(input("Quantidade a remover: "))
            estoque.removerItem(item, quantidade)
        case '3':
            estoque.exibirEstoque()
        case '4':
            item = input("Nome do item: ")
            estoque.pesquisarItem(item)
        case '5':
            print("Saindo...")
            break
        case _:
            print("Opção inválida. Por favor, escolha uma opção válida.")

