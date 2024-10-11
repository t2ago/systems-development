from models.pessoa import Pessoa
from models.enums.sexo import Sexo

aluno = Pessoa("Ana", 22, Sexo.FEMININO)
print(aluno)