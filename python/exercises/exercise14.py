import os
from dataclasses import dataclass

os.system("cls||clear")

QUANTIDADE_LIVROS = 2

@dataclass
class Livro:
    titulo: str
    autor: str
    paginas: int
    preco: float
    
livros = []

for i in range(QUANTIDADE_LIVROS):
    titulo = input("Digite o titulo: ")
    autor = input("Digite o nome do autor: ")
    paginas = int(input("Quantidade de páginas: "))
    preco = float(input("Digite o preço: "))
    livro = Livro(titulo = titulo, autor = autor, paginas = paginas, preco = preco)
    livros.append(livro)
    
for dados_livro in livros:
    print(f"Título: {dados_livro.titulo}")
    print(f"Autor: {dados_livro.autor}")
    print(f"Número de páginas: {dados_livro.paginas}")
    print(f"Preço: {dados_livro.preco}")