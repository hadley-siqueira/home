class Bola() :
    def __init__(self, c, circ, mat):
        self.cor = c
        self.circunferencia = circ
        self.material = mat

    def trocarCor(self, cor):
        self.cor = cor

    def mostrarCor(self):
        return self.cor

def main():
    b1 = Bola('Azul', 6, 'plástico')
    print('Cor da bola: ' + str(b1.mostrarCor()))
    b1.trocarCor('Vermelho')
    print('Cor da bola: ' + str(b1.mostrarCor()))

main()


