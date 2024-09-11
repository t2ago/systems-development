from models.funcionario import Funcionario
from models.endereco import Endereco
from models.enums.sexo import Sexo
from models.enums.setor import Setor
from models.enums.unidade_federativa import UnidadeFederativa

endereco = Endereco("A", "22", UnidadeFederativa.SAO_PAULO)
funcionario = Funcionario(123, "Ana", "111.222.333-44", "XXX", "01", "01/01/01", Sexo.FEMININO, Setor.SAUDE, 9999, "1199999-9999", "ana@gmail.com", endereco)

print(funcionario)