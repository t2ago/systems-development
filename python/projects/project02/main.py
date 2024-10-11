from models.funcionario import Funcionario
from models.enums.sexo import Sexo
from models.enums.setor import Setor

funcionario = Funcionario(123, "Ana", 23, 3000, Setor.MARKETING, Sexo.FEMININO)
print(funcionario)