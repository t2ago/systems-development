from models.employees import Funcionario
from models.address import Endereco
from models.enums.sex import Sexo
from models.enums.sector import Setor
from models.enums.federative_unit import UnidadeFederativa

endereco = Endereco("A", "22", UnidadeFederativa.SAO_PAULO)
funcionario = Funcionario(123, "Ana", "111.222.333-44", "XXX", "01", "01/01/01", Sexo.FEMININO, Setor.SAUDE, 9999, "1199999-9999", "ana@gmail.com", endereco)

print(funcionario)