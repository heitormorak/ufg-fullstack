class Apartamento:
    def __init__(self, numero, andar, metragem, situacao):
        self.numero = numero
        self.andar = andar
        self.metragem = metragem
        self.situacao = situacao
        self.morador = None
    
    def associar_morador(self, morador):
        self.morador = morador
    
    def desassociar_morador(self):
        self.morador = None
