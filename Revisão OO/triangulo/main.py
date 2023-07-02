from triangulo import Triangulo
            
            
class Main:
    def __init__(self):
        self.t1 = Triangulo(3, 3, 3)
        self.t2 = Triangulo(2, 2, 3)
        self.t3 = Triangulo(3, 4, 5)
    
    def imprimir_tipos(self):
        self.t1.tipo_triangulo()
        self.t2.tipo_triangulo()
        self.t3.tipo_triangulo()

