class Quadrado():
    def __init__(self, t_lado):
        self.lado = t_lado

    def mudarLado(self, lado):
        self.lado = lado

    def retornarLado(self):
        return self.lado

    def calcularArea(self):
        import math
        return math.pow(self.lado, 2)

def main():
    q1 = Quadrado(5)
    print('Lado: ' + str(q1.retornarLado()))
    print('Área: ' + str(q1.calcularArea()))
    q1.mudarLado(7)
    print('Lado: ' + str(q1.retornarLado()))
    print('Área: ' + str(q1.calcularArea()))

main()
