class Cachorro():
    def __init__(self, n, i, p, r):
        self.nome = n
        self.idade = i
        self.peso = p
        self.raca = r

    def darPatinha(self):
        print(str(self.nome) + ' deu a patinha')
    
    def latir(self):
        print('auauauauau!')

    def status(self, dono):
        print('Nome: ' + str(self.nome))
        print('Dono: ' + str(dono.nome))
        print('Idade ' + str(self.idade))
        print('Peso: ' + str(self.peso))

class Pessoa():
    def __init__(self, n, i, p, c):
        self.nome = n
        self.idade = i
        self.peso = p 
        self.cao = c
    
    def completarAno(self):
        print(str(self.nome) + ' Parabéns, você completou ano!!!')
        self.idade += 1
      
    def status(self, cao):
        print('Nome: ' + str(self.nome))
        print('Idade ' + str(self.idade))
        print('Peso: ' + str(self.peso))
        print('Cão: ' + str(cao.nome))

    def treinarCao(self, cao):
        cao.darPatinha()
        cao.latir()

def main():
    #Criação de objetos
    print('** Criação de um cachorro **')
    n1 = str(input('Digite o nome do cachorro: '))
    i1 = int(input('Digite a idade do cachorro: '))
    p1 = float(input('Digite o peso do cachorro: '))
    r = str(input('Digite a raça do cachorro: '))
    c1 = Cachorro(n1, i1, p1, r)

    print('** Criação de uma pessoa **')
    n2 = str(input('Digite o nome da pessoa: '))
    i2 = int(input('Digite a idade da pessoa: '))
    p2 = float(input('Digite o peso da pessoa: '))
    p1 = Pessoa(n2, i2, p2, c1)
    #Chamada de funções
    print('** Informações da pessoa **')
    p1.status(c1)
    print('** Informações do cachorro **')
    c1.status(p1)
    p1.treinarCao(c1)

main()
