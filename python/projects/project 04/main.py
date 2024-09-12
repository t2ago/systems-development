from models.enums.gender import Sexo
from models.enums.sector import Setor
from models.enums.federative_unit import UnidadeFederativa
from models.address import Endereco
from models.person import Pessoa
from models.natural_person import Fisica
from models.employee import Employee
from models.motoboy import Motoboy
from models.doctor import Medico
from models.attorney import Advogado

endereco = Endereco("A", "23", "Térreo", "12345-678", "B", UnidadeFederativa.SAO_PAULO)
pessoa = Pessoa("Ana", "1199999-9999", "ana@gmail.com", endereco)
fisica = Fisica(pessoa, "111.222.333-44", "555", "01/01/01", Sexo.FEMININO)
funcionario = Employee(fisica, "123", Setor.SAUDE, 9000)
motoboy = Motoboy(funcionario, "111")
medico = Medico(funcionario, "222")
advogado = Advogado(funcionario, "333")

print(motoboy)
print(medico)
print(advogado)