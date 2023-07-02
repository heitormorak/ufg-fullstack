from apartamento import Apartamento

class Edificio:
    def __init__(self, nome, endereco):
        self.nome = nome
        self.endereco = endereco
        self.apartamentos = []
    
    def adicionar_apartamento(self, apartamento):
        self.apartamentos.append(apartamento)
    
    def mostrar_apartamentos(self):
        for apartamento in self.apartamentos:
            print(f"Numero: {apartamento.numero} | Andar: {apartamento.andar} | Metragem: {apartamento.metragem} | Situação: {apartamento.situacao}")
            if apartamento.morador:
                print(f"Morador: {apartamento.morador.nome} | CPF: {apartamento.morador.cpf} | Telefone: {apartamento.morador.telefone}")
            else:
                print("Morador: Nenhum")
            print()
