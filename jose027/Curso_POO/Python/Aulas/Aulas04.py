class Cachorro(object):
    raca = 'Pitbull'
    cor = 'Mesclado'
    
    def __init__(self, n, i):
        self.nome = n
        self.idade = i

    def treinar(self):
        print(self.nome + ' está treinando')

    def latir(self):
        print('auauau')
    
    def status(self):
        print('Raça: ' + str(self.raca))
        print('Cor: ' + str(self.cor))
        print('Nome: ' + str(self.nome))
        print('Idade: ' + str(self.idade))

def main():
    c1 = Cachorro('Axel', 2)
    c2 = Cachorro('Luna', 1)
    c1.status()
    c1.latir()
    c2.status()
    c2.treinar()

main()
